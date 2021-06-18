package Exercises.src.com.codewithmosh.template;

public class Window extends Template {
//    public void close() {
//        //TODO: custom windows may need to execute some code before the window
//        // is closed.
//
//        System.out.println("Removing the window from the screen");
//
//        //TODO: custom windows may need to execute some code after the window
//        // is closed.
//    }

    @Override
    protected void doPreRemoveActivities() {
        System.out.println("Doing pre close activities");
    }

    @Override
    protected void doPostRemoveActivities() {
        System.out.println("Doing post close activities");
    }
}
