package homework.onlineStore.storeStorage;

import homework.onlineStore.model.Order;
import homework.onlineStore.model.OrderStatus;
import homework.onlineStore.model.Product;
import homework.onlineStore.model.User;

public class OrderStorage {
    private Order[] orders = new Order[10];
    private int size;

    public void addOrder(Order order) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = order;
    }


    private void extend() {
        Order[] temp = new Order[size + 10];
        System.arraycopy(orders, 0, temp, 0, orders.length);
        orders = temp;
    }


    public void printOrders() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    public Product changeOrderStatus(Order order) {
        if (order.getOrderStatus() == OrderStatus.DELIVERED) {
            return order.getProduct();
        }
        return null;
    }

    public Order orderById(String orderId) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(orderId)) {
                return orders[i];
            }
        }
        return null;
    }

    public void printMyOrders(User user) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getUser().equals(user)) {
                System.out.println(orders[i]);
            }
        }
    }

    public void cancelOrderById(String orderId) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(orderId)) {
                orders[i].setOrderStatus(OrderStatus.CANCELED);
            }
        }

    }
}
