package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    //CARTAS MAGIC
    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }

    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.40);

    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.80);

    }

    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void calculatePriceForMagicCards_blackLotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);

    }


    //PRODUCTOS GOURMET
    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }

    //MASCOTAS
    @Test
    void calculatePriceForLandAnimal_withTwoLegs() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(2, null, false, null, null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 8.4);
    }

    @Test
    void calculatePriceForLandAnimal_withFourLegs() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);
    }

    @Test
    void calculatePriceForLandAnimal_withEightLegs() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, null, null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 33.6);
    }

}