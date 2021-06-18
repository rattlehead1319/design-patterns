package Exercises.src.com.codewithmosh.chainOfResponsibility;

public class UnknownFileFormatHandler extends Handler {

    public UnknownFileFormatHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileExtension) {
        System.out.println("Unsupported file format");
        return true;
    }
}
