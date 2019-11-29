public class StringManipulatorTest {
    public static void main (String [] args) {
        String result = StringManipulator.TrimAndConcat("  hello   ", "  world   ");
        System.out.println(result);
        String result1 = StringManipulator.GetIndexOrNull("hello", 'w');
        System.out.println(result1);
        String result2 = StringManipulator.ConcatSubstring("hello", 5, 5, "world");
    }
}