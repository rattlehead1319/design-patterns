package Exercises.src.com.codewithmosh.chainOfResponsibility;

public abstract class Handler {
    Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(String fileExtension) {
        if (doHandle(fileExtension)) {
            return;
        }
        if (next != null) {
            next.handle(fileExtension);
        }
    }

    public abstract boolean doHandle (String fileExtension);
}
