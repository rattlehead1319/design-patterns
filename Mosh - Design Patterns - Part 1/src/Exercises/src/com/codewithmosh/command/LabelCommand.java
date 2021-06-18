package Exercises.src.com.codewithmosh.command;

public class LabelCommand implements UndoableCommand {

    private String prevLabel;
    private History history;
    private VideoEditor videoEditor;

    public LabelCommand(History history, VideoEditor videoEditor) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        prevLabel = videoEditor.getText();
        videoEditor.setText("New Text");
        history.push(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setText(prevLabel);
    }
}
