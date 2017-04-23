package Singleton;

/**
 * Created by Alfie on 4/19/2017.
 * Single.java
 */
class Single {
    private static Single single = new Single();

    private Single() {

    }

    public static Single getInstance() {
        return single;
    }
}
