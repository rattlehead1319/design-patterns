package Exercises.src.com.codewithmosh.chainOfResponsibility;

public class NumbersReader extends Handler {

    public NumbersReader(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileExtension) {
        if (".numbers".equals(fileExtension)) {
            System.out.println("Reading numbers file");
            return true;
        }
        return false;
    }
}
