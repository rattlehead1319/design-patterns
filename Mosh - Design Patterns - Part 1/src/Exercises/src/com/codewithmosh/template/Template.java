package Exercises.src.com.codewithmosh.template;

public abstract class Template {

    public void remove() {
        doPreRemoveActivities();
        System.out.println("Removing the window from the screen");
        doPostRemoveActivities();
    }

    protected abstract void doPreRemoveActivities();
    protected abstract void doPostRemoveActivities();
}
