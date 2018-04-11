package com.example.rauhilverma.book_mark;

/**
 * Created by RauhilVerma on 04-04-2018.
 */

public class CartItem {
    private Product product;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
