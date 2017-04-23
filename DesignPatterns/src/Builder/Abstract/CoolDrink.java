package Builder.Abstract;

import Builder.Interface.Item;
import Builder.Interface.Packing;
import Builder.Main.Bottle;

/**
 * Created by Alfie on 4/20/2017.
 * CoolDrink.java
 */
public abstract class CoolDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract String name();
}
