package homework.onlineStore.storeUtil;

import java.sql.SQLOutput;

public interface Command {

    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";


    String LOGOUT = "0";
    String ADD_PRODUCT = "1";
    String REMOVE_PRODUCT_BY_ID = "2";
    String PRINT_PRODUCTS = "3";
    String PRINT_USERS = "4";
    String PRINT_ORDERS = "5";
    String CHANGE_ORDER_STATUS = "6";

    String PRINT_ALL_PRODUCTS = "1";
    String BUY_PRODUCT = "2";
    String PRINT_MY_ORDERS = "3";
    String CANCEL_ORDER_BY_ID = "4";


    static void loginCommand() {
        System.out.println("please input " + EXIT + "for exit");
        System.out.println("please input " + LOGIN + " for enter");
        System.out.println("please input " + REGISTER + " for register");
    }

    static void adminCommand() {
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + ADD_PRODUCT + " for add product");
        System.out.println("please input " + REMOVE_PRODUCT_BY_ID + " for add product");
        System.out.println("please input " + PRINT_PRODUCTS + " for add product");
        System.out.println("please input " + PRINT_USERS + " for add product");
        System.out.println("please input " + PRINT_ORDERS + " for add product");
        System.out.println("please input " + CHANGE_ORDER_STATUS + " for add product");
    }

    static void userCommand() {
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + PRINT_ALL_PRODUCTS + "for print all products");
        System.out.println("please input " + BUY_PRODUCT + "for buy product");
        System.out.println("please input " + PRINT_MY_ORDERS + "for print my orders");
        System.out.println("please input " + CANCEL_ORDER_BY_ID + "for cancel order by id");
    }


}
