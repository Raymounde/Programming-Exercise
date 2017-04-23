package Builder.Main;

import Builder.Abstract.CoolDrink;

/**
 * Created by Alfie on 4/20/2017.
 * Coke.java
 */
public class Coke extends CoolDrink{

    @Override
    public float price() {
        return 0.50f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
