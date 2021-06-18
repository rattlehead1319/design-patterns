package Exercises.src.com.codewithmosh.visitor;

public class ReverbOperation implements Operation {

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reverb operation for format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reverb operation for fact segment");
    }
}
