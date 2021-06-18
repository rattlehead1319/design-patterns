package Exercises.src.com.codewithmosh.visitor;

public class NormalizeOperation implements Operation {

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalized format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalized Fact segment");
    }
}
