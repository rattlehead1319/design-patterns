package Exercises.src.com.codewithmosh.observer;

public class ObserverImpl {
    public static void main(String[] args) {
        Stock stock = new Stock("Apple", 2.3f);
        stock.addObserver(new StatusBar());
        stock.addObserver(new StockListView());

        stock.setPrice(3.4f);
    }
}
