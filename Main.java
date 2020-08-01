package orcunsagirsoy;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	    double price = hamburger.itemizeHamburger();
	    hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealtyBurger healtyBurger = new HealtyBurger("Bacon", 5.67);
        healtyBurger.itemizeHamburger();
        healtyBurger.addHamburgerAddition1("Egg", 5.43);
        healtyBurger.itemizeHamburger();
        healtyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healtyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

    }
//     OUTPUT
//    Basic hamburger  on a White roll with Sausage, price is 3.56
//    Basic hamburger  on a White roll with Sausage, price is 3.56
//    Added Tomato for an extra 0.27
//    Added Lettuce for an extra 0.75
//    Added Cheese for an extra 1.12
//    Total Burger price is 5.7
//    Healthy hamburger  on a Brown rye roll with Bacon, price is 5.67
//    Healthy hamburger  on a Brown rye roll with Bacon, price is 5.67
//    Added Egg for an extra 5.43
//    Healthy hamburger  on a Brown rye roll with Bacon, price is 5.67
//    Added Egg for an extra 5.43
//    Added Lentils for an extra 3.41
//    Total Healthy Burger price is 14.51
//    Cannot add additional items to a deluxe burger
//    Deluxe hamburger  on a White roll with Sausage & Bacon, price is 14.54
//    Added Chips for an extra 2.75
//    Added Drink for an extra 1.81


}
