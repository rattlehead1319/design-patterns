package Exercises.src.com.codewithmosh.chainOfResponsibility;

public class QbwReader extends Handler {

    public QbwReader(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileExtension) {
        if (".qbw".equals(fileExtension)) {
            System.out.println("Reading qbw file");
            return true;
        }
        return false;
    }
}
