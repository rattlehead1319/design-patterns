package Exercises.src.com.codewithmosh.chainOfResponsibility;

public class ExcelReader extends Handler {

    public ExcelReader(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileExtension) {
        if (".xls".equals(fileExtension)) {
            System.out.println("Reading excel file");
            return true;
        }
        return false;
    }
}
