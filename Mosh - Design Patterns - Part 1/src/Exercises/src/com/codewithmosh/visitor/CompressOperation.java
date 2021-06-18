package Exercises.src.com.codewithmosh.visitor;

public class CompressOperation implements Operation {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Compressed Format Segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Compressed Fact Segment");
    }
}
