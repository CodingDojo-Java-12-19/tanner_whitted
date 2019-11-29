public class PythagoreanTest {
    public static void main (String[] args) {
        // static method
        double result = Pythagorean.calculateHypotenuse(10, 5);
        System.out.println(result);
        // instance method
        Pythagorean pythag = new Pythagorean();
        double instanceResult = pythag.calculatedHypotenuse(5, 5);
        System.out.println(instanceResult);
    }
}