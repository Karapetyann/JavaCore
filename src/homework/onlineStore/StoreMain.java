package homework.onlineStore;

import homework.onlineStore.model.*;
import homework.onlineStore.storeStorage.OrderStorage;
import homework.onlineStore.storeStorage.ProductStorage;
import homework.onlineStore.storeStorage.UserStorage;
import homework.onlineStore.storeUtil.Command;
import homework.onlineStore.storeUtil.DateUtil;
import homework.onlineStore.storeUtil.StoreIdGenerate;

import java.util.Date;
import java.util.Scanner;

public class StoreMain implements Command {
    private final static Scanner scanner = new Scanner(System.in);
    private final static UserStorage userStorage = new UserStorage();
    private final static ProductStorage productStorage = new ProductStorage();
    private final static OrderStorage orderStorage = new OrderStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Command.loginCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT -> isRun = false;
                case LOGIN -> login();
                case REGISTER -> register();
                default -> System.out.println("Wrong Command!! Try Again");
            }
        }
    }

    private static void register() {
        String userId = StoreIdGenerate.idGenerate();
        System.out.println("please input your name");
        String name = scanner.nextLine();
        System.out.println("please input your register email");
        String email = scanner.nextLine();
        System.out.println("please input your password");
        String password = scanner.nextLine();
        User user1 = userStorage.getByEmailAndPassword(email, password);
        if (user1 == null) {
            User user = new User(userId, name, email, password, UserType.USER);
            userStorage.addUser(user);
        } else {
            System.out.println("this account already exists");
        }
    }

    private static void login() {
        System.out.println("please input your email");
        String email = scanner.nextLine();
        System.out.println("please input your password");
        String password = scanner.nextLine();
        User user = userStorage.getByEmailAndPassword(email, password);
        if (user == null) {
            System.out.println("Incorrect login or password");
            return;
        }
        if (user.getUserType() == UserType.ADMIN) {
            Command.adminCommand();
            adminInterface();
        } else {
            Command.userCommand();
            userInterface();
        }
    }

    private static void userInterface() {
        boolean isRun = true;
        String command = scanner.nextLine();
        while (isRun) {
            switch (command) {
                case LOGOUT -> isRun = false;
                case PRINT_ALL_PRODUCTS -> printProducts();
                case BUY_PRODUCT -> buyProduct();
                case PRINT_MY_ORDERS -> printMyOrders();
                case CANCEL_ORDER_BY_ID -> cancelOrderById();
                default -> System.out.println("Wrong Command!! Try Again");
            }
        }
    }

    private static void cancelOrderById() {
        System.out.println("please input order id");
        String orderId = scanner.nextLine();
        orderStorage.cancelOrderById(orderId);
    }

    private static void printMyOrders() {
        User user = userStorage.popUser();
        orderStorage.printMyOrders(user);
    }

    private static void buyProduct() {
        printProducts();
        System.out.println("please input product id");
        String productId = scanner.nextLine();
        Product product = productStorage.getById(productId);
        if (product == null) {
            System.out.println("Wrong id!! try again");
            return;
        }
        System.out.println(product);
        System.out.println("please input specify product quantity");
        int qty = Integer.parseInt(scanner.nextLine());
        String orderId = StoreIdGenerate.idGenerate();
        User user = userStorage.popUser();
        String date1 = DateUtil.dateFormat;
        Date date = DateUtil.stringToDate(date1);
        System.out.println("please input payment method - CARD, CASH, PAYPAL");
        try {
            PaymentMethod paymentMethod = PaymentMethod.valueOf(scanner.nextLine());
            Order order = new Order(orderId, user, product, date, product.getPrice(), OrderStatus.NEW, qty, paymentMethod);
            orderStorage.addOrder(order);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong method!! try again");
        }

    }

    private static void adminInterface() {
        boolean isRun = true;
        String command = scanner.nextLine();
        while (isRun) {
            switch (command) {
                case LOGOUT -> isRun = false;
                case ADD_PRODUCT -> addProduct();
                case REMOVE_PRODUCT_BY_ID -> removeProductById();
                case PRINT_PRODUCTS -> printProducts();
                case PRINT_USERS -> printUsers();
                case PRINT_ORDERS -> printOrders();
                case CHANGE_ORDER_STATUS -> changeOrderStatus();
                default -> System.out.println("Wrong Command!! Try Again");
            }
        }
    }

    private static void changeOrderStatus() {
        orderStorage.printOrders();
        System.out.println("please input order id");
        String orderId = scanner.nextLine();
        Order order = orderStorage.orderById(orderId);
        if (order == null) {
            System.out.println("wrong order id!! try again");
        } else {
            Product product = orderStorage.changeOrderStatus(order);
            productStorage.deleteStockQty(product, order.getQty());
        }
    }

    private static void printOrders() {
        orderStorage.printOrders();
    }

    private static void printUsers() {
        userStorage.printUsers();
    }

    private static void printProducts() {
        productStorage.printProducts();
    }

    private static void removeProductById() {
        System.out.println("please input product by id");
        String productId = scanner.nextLine();
        productStorage.removeById(productId);
        System.out.println("product removed");
    }

    private static void addProduct() {
        System.out.println("please input product id");
        String productId = scanner.nextLine();
        Product product = productStorage.getById(productId);
        if (product != null) {
            System.out.println("this product already exists");
            return;
        }
        System.out.println("please input product name");
        String name = scanner.nextLine();
        System.out.println("please input product description");
        String description = scanner.nextLine();
        System.out.println("please input product price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input product  stockQty");
        int stockQty = Integer.parseInt(scanner.nextLine());
        System.out.println("please input product Type -  ELECTRONICS, CLOTHING, BOOKS");
        try {
            ProductType productType = ProductType.valueOf(scanner.nextLine());
            Product product1 = new Product(productId, name, description, price, stockQty, productType);
            productStorage.addProduct(product1);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong type!! try again");
        }
    }

}
