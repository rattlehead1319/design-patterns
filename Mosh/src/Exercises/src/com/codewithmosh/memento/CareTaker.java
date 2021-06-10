package Exercises.src.com.codewithmosh.memento;

import java.util.*;

public class CareTaker {
    Stack<Memento> history = new Stack<>();

    public void push (Memento state) {
        history.push(state);
    }

    public Memento pop() throws Exception {
        if (history.isEmpty()) {
            throw new Exception("Empty History Stack exception");
        }
        return history.pop();
    }
}
