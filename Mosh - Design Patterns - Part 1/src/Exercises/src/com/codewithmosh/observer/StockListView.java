package Exercises.src.com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {

    @Override
    public void update(float price) {
        System.out.println("Price got updated " + price);
    }
}
