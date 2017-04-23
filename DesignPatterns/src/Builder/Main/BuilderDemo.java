package Builder.Main;

/**
 * Created by Alfie on 4/21/2017.
 * BuilderDemo.java
 */
public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.buildMealOne();
        System.out.println("Meal One");
        meal.showItems();
        System.out.println("Total: " + meal.getCost());

        meal = mealBuilder.buildMealTwo();
        System.out.println("\nMeal Two");
        meal.showItems();
        System.out.println("Total: " + meal.getCost());
    }
}
