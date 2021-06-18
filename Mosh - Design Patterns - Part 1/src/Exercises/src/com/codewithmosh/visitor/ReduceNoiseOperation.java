package Exercises.src.com.codewithmosh.visitor;

public class ReduceNoiseOperation implements Operation {

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduced Noise at Format Segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduced noise for fact segment");
    }
}
