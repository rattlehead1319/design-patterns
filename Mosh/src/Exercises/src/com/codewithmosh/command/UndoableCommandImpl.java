package Exercises.src.com.codewithmosh.command;

public class UndoableCommandImpl {
    public static void main(String[] args) {
        History history = new History();
        VideoEditor videoEditor = new VideoEditor();
        LabelCommand labelCommand = new LabelCommand(history, videoEditor);
        labelCommand.execute();

        System.out.println(videoEditor.getText());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(videoEditor.getText());

        ContrastCommand contrastCommand = new ContrastCommand(history, videoEditor);
        contrastCommand.execute();

        System.out.println(videoEditor.getContrast());

        undoCommand.execute();

        System.out.println(videoEditor.getContrast());
    }
}
