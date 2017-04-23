package Builder.Main;

/**
 * Created by Alfie on 4/21/2017.
 * MealBuilder.java
 */
public class MealBuilder {

    public Meal buildMealOne() {
        Meal meal = new Meal();

        meal.addItem(new MeatyBurger());
        meal.addItem(new Royal());

        return meal;
    }

    public Meal buildMealTwo() {
        Meal meal = new Meal();

        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }
}
