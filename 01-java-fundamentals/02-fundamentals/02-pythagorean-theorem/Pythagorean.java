public class Pythagorean {
    // static method
    public static double calculateHypotenuse(int legA, int legB) {
        return Math.sqrt((legA * legA ) + (legB * legB));
    }
    // instance method
    public double calculatedHypotenuse(int legA, int legB) {
        System.out.println("second method");
        return Math.sqrt((legA * legA ) + (legB * legB));
    }
}