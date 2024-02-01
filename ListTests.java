import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testfilter()
    {
        List<String> input1 = new ArrayList<>();
        input1.add("ab");
        input1.add("ba");
        input1.add("cd");
        input1.add("de");
        input1.add("ef");
        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) {
                return s.contains("a");
            }
        };
        List<String> result = ListExamples.filter(input1, sc);
        List<String> expected = new ArrayList<>();
        expected.add("ab");
        expected.add("ba");
        assertEquals(expected, result);
    }

    @Test
    public void testmerge()
    {
        List<String> input1 = new ArrayList<>();
        input1.add("c");
        input1.add("c");
        List<String> input2 = new ArrayList<>();
        input2.add("b");
        input2.add("d");
        List<String> result = ListExamples.merge(input1, input2);
        List<String> expected = new ArrayList<>();
        expected.add("b");
        expected.add("c");
        expected.add("c");
        expected.add("d");
        assertEquals(expected, result);
    }
}
