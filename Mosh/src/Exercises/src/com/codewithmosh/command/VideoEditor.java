package Exercises.src.com.codewithmosh.command;

public class VideoEditor {
    private float contrast = 0.5f;
    private String text = "Old Text";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void removeText() {
        this.text = "";
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", text='" + text + '\'' +
                '}';
    }
}
