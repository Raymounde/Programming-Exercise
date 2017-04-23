package Factory;

/**
 * Created by Alfie on 4/20/2017.
 * QuarterPound.java
 */
public class QuarterPound implements Burger{
    @Override
    public void create() {
        System.out.println("Create QuarterPound burger");
    }
}
