package Exercises.src.com.codewithmosh.visitor;

public class VisitorImplementation {
    public static void main(String[] args) {
        WavFile wavFile = new WavFile();
        wavFile.read("some file name");
        //wavFile.execute(new NormalizeOperation());
        //wavFile.execute(new ReverbOperation());
        wavFile.execute(new CompressOperation());
    }
}
