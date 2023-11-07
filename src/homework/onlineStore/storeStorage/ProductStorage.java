package homework.onlineStore.storeStorage;

import homework.onlineStore.model.Product;
import homework.onlineStore.storeException.OutOfStockException;
import homework.onlineStore.storeUtil.StorageSerializable;

import java.io.Serializable;

public class ProductStorage implements Serializable {
    private Product[] products = new Product[10];
    private int size;
    private Exception OutOfStockException;

    public void addProduct(Product product) {
        if (size == products.length) {
            extend();
        }
        products[size++] = product;
        StorageSerializable.serializeProductStorage(this);
    }

    private void extend() {
        Product[] temp = new Product[size + 10];
        System.arraycopy(products, 0, temp, 0, products.length);
        products = temp;
    }


    public Product getById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                return products[i];
            }
        }
        return null;

    }

    public void removeById(String productId) {
        Product product = getById(productId);
        if (product != null) {
            for (int i = 0; i < size; i++) {
                if (products[i].getId().equals(productId)) {
                    for (int j = i; j <= size; j++) {
                        products[i] = products[i + 1];
                    }
                    break;
                }
            }
            size--;
            StorageSerializable.serializeProductStorage(this);
            System.out.println("product removed");
        } else {
            System.out.println("Wrong id!! try again");
        }
    }

    public void printProducts() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public void deleteStockQty(Product product, int qty) {
        for (int i = 0; i < size; i++) {
            if (products[i].equals(product)) {
                products[i].setStockQty(products[i].getStockQty() - qty);
            }
        }
    }

    public void checkQty(Product product, int qty) throws OutOfStockException {
        if (product.getStockQty() < qty || product.getStockQty() == 0) {
            throw new OutOfStockException("sorry there are not enough products in storage");
        }
    }
}
