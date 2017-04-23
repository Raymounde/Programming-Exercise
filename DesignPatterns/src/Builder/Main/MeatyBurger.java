package Builder.Main;

import Builder.Abstract.Burger;

/**
 * Created by Alfie on 4/20/2017.
 * MeatyBurger.java
 */
public class MeatyBurger extends Burger{
    @Override
    public float price() {
        return 1.25f;
    }

    @Override
    public String name() {
        return "Meaty Burger";
    }
}
