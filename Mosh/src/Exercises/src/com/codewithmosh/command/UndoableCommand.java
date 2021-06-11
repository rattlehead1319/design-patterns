package Exercises.src.com.codewithmosh.command;

public interface UndoableCommand extends Command {
    void unexecute();
}
