package Exercises.src.com.codewithmosh.memento;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Memento createState () {
        Document d = new Document();
        d.content = this.content;
        d.fontName = this.fontName;
        d.fontSize = this.fontSize;
        return new Memento(d);
    }

    public void restoreState (Memento state) {
        this.content = state.getDocument().content;
        this.fontName = state.getDocument().fontName;
        this.fontSize = state.getDocument().fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
