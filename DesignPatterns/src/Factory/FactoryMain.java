package Factory;

/**
 * Created by Alfie on 4/20/2017.
 * Factory.java
 */
public class FactoryMain {

    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();

        Burger burger1 = burgerFactory.getBurger("Kiddie");
        Burger burger2 = burgerFactory.getBurger("QuarterPound");

        if (burger1 != null)
            burger1.create();

        if (burger2 != null)
            burger2.create();
    }
}
