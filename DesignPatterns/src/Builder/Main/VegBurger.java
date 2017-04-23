package Builder.Main;

import Builder.Abstract.Burger;

/**
 * Created by Alfie on 4/20/2017.
 * VegBurger.java
 */
public class VegBurger extends Burger{
    @Override
    public float price() {
        return 1.75f;
    }

    @Override
    public String name() {
        return "Vegetarian Burger";
    }
}
