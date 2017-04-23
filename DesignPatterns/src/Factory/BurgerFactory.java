package Factory;

/**
 * Created by Alfie on 4/20/2017.
 * BurgerFactory.java
 */
class BurgerFactory {
    // Get burger type
    Burger getBurger(String type) {
        if (type.isEmpty())
            return null;
        else if (type.equalsIgnoreCase("Kiddie"))
            return new Kiddie();
        else if (type.equalsIgnoreCase("QuarterPound"))
            return new QuarterPound();

        return null;
    }
}
