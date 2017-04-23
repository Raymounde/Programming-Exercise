package Factory;

/**
 * Created by Alfie on 4/20/2017.
 * Kiddie.java
 */
public class Kiddie implements Burger {
    @Override
    public void create() {
        System.out.println("Create Kiddie burger");
    }
}
