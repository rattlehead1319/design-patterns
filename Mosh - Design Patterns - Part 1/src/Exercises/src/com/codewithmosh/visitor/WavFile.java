package Exercises.src.com.codewithmosh.visitor;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public void read(String fileName) {
        // Simulate reading a wav file and building the segments
        segments.add(new FormatSegment());
        segments.add(new FactSegment());
        segments.add(new FactSegment());
        segments.add(new FactSegment());
    }

    public void execute (Operation operation) {
        for (Segment segment : segments) {
            segment.execute(operation);
        }
    }
}
