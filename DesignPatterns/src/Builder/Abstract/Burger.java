package Builder.Abstract;

import Builder.Interface.Item;
import Builder.Interface.Packing;
import Builder.Main.Wrapper;

/**
 * Created by Alfie on 4/20/2017.
 * Burger.java
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract String name();
}
