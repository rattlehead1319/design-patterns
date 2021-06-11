package Exercises.src.com.codewithmosh.command;

public class ContrastCommand implements UndoableCommand {

    private float prevContent;
    private History history;
    private VideoEditor videoEditor;

    public ContrastCommand(History history, VideoEditor videoEditor) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        prevContent = videoEditor.getContrast();
        videoEditor.setContrast(0.8f);
        history.push(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContent);
    }
}
