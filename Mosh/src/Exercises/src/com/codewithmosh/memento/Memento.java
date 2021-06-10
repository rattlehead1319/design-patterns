package Exercises.src.com.codewithmosh.memento;

public class Memento {
    private Document document;

    public Memento (Document document) {
        this.document = document;
    }

    public Document getDocument () {
        return document;
    }
}
