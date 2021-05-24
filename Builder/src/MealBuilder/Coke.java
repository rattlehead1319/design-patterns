package MealBuilder;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 1.2f;
    }

    @Override
    public String name() {
        return "MealBuilder.Coke";
    }
}
