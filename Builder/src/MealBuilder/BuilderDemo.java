package MealBuilder;

public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();

        Meal vegMeal = mb.prepareVegMeal();
        System.out.println("Veg MealBuilder.Meal");
        vegMeal.showItems();
        System.out.println("Cost: " + vegMeal.getCost());

        System.out.println();

        Meal nonVegMeal = mb.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Cost: " + nonVegMeal.getCost());
    }



}
