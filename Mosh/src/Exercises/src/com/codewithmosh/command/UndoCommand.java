package Exercises.src.com.codewithmosh.command;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.getSize() > 0) {
            history.pop().unexecute();
        }
    }
}
