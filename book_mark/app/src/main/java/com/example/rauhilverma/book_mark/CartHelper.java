package com.example.rauhilverma.book_mark;
import com.example.rauhilverma.book_mark.Cart;
/**
 * Created by RauhilVerma on 04-04-2018.
 */

public class CartHelper {
    private static Cart cart = new Cart();

    /**
     * Retrieve the shopping cart. Call this before perform any manipulation on the shopping cart.
     *
     * @return the shopping cart
     */
    public static Cart getCart() {
        if (cart == null) {
            cart = new Cart();
        }

        return cart;
    }
}
