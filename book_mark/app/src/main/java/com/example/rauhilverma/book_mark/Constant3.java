package com.example.rauhilverma.book_mark;

/**
 * Created by RauhilVerma on 04-04-2018.
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public final class Constant3 {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Autobiography of Mark Twain", BigDecimal.valueOf(199.996), "Autobiography of Mark Twain or Mark Twain’s Autobiography refers to a lengthy set of reminiscences, dictated, for the most part, in the last few years of American author Mark Twain's life and left in typescript and manuscript at his death.", "auto_1");
    public static final Product PRODUCT2 = new Product(2, "Autobiography of Gandhi", BigDecimal.valueOf(449.9947), "The Story of My Experiments with Truth is the autobiography of Mohandas K. Gandhi, covering his life from early childhood through to 1921. It was written in weekly instalments and published in his journal Navjivan from 1925 to 1929", "auto_2");
    public static final Product PRODUCT3 = new Product(3, "Autobiography of Benjamin Franklin", BigDecimal.valueOf(319.998140), "The Autobiography of Benjamin Franklin is the traditional name for the unfinished record of his own life written by Benjamin Franklin from 1771 to 1790; however, Franklin himself appears to have called the work his Memoirs.", "auto_3");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
    }

    public static final String CURRENCY = "$";
}
