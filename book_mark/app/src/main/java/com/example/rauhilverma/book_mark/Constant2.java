package com.example.rauhilverma.book_mark;

/**
 * Created by RauhilVerma on 04-04-2018.
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public final class Constant2 {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Star Wars", BigDecimal.valueOf(199.996), "Death Star is a 2007 science fiction novel by Michael Reaves and Steve Perry that is set in the Star Wars galaxy.", "sw");
    public static final Product PRODUCT2 = new Product(2, "The Grand Design", BigDecimal.valueOf(449.9947), "The Grand Design is a popular-science book written by physicists Stephen Hawking and Leonard Mlodinow and published by Bantam Books in 2010. The book examines the history of scientific knowledge about the universe and explains 11 dimension M-theory.", "tgd");
    public static final Product PRODUCT3 = new Product(3, "Stars Are Legion", BigDecimal.valueOf(319.998140), "As worlds continue to die, a desperate plan is put into motion. Somewhere on the outer rim of the universe, a mass of decaying world-ships known as the Legion is traveling in the seams between the stars. Here in the darkness, a war for control of the Legion has been waged for generations, with no clear resolution. ", "sal");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
    }

    public static final String CURRENCY = "$";
}
