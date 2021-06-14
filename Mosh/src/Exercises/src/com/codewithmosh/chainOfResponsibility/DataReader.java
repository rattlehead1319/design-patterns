package Exercises.src.com.codewithmosh.chainOfResponsibility;

public class DataReader {
    public void read(String fileName) {
        UnknownFileFormatHandler unknownFileFormatHandler = new UnknownFileFormatHandler(null);
        QbwReader qbwReader = new QbwReader(unknownFileFormatHandler);
        NumbersReader numbersReader = new NumbersReader(qbwReader);
        ExcelReader excelReader = new ExcelReader(numbersReader);

        excelReader.handle(fileName);
    }
}
