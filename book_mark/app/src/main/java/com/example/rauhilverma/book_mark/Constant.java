package com.example.rauhilverma.book_mark;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RauhilVerma on 04-04-2018.
 */
import com.example.rauhilverma.book_mark.Product;
public final class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "The 7th Victim", BigDecimal.valueOf(199.996), "Introducing FBI profiler Karen Vail, who crosses paths with a Virginia serial killer in the first in the bestselling series.", "book_trill1");
    public static final Product PRODUCT2 = new Product(2, "The Girl On The Train", BigDecimal.valueOf(449.9947), "Rachel, the main narrator of Paula Hawkins' novel The Girl on the Train, is obsessed with the pair; they represent to her the perfect relationship that she once had, or seemed to, before it imploded spectacularly. She can't stop thinking about Jason and Jess, but she doesn't know them.", "book_trill2");
    public static final Product PRODUCT3 = new Product(3, "Wrong place", BigDecimal.valueOf(319.998140), "DI Sally Parker has a serial killer on her patch. One thing that sets this killer apart from the others she's hunted before: his willingness to leave DNA at each of the crime scenes. It's up to Sally and her partner DS Jack Blackman to find out why before the body count rises to double figures.", "book_thrill3");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
    }

    public static final String CURRENCY = "$";
}