public class SamuraiTest {
    public static void main(String[] args){
        Samurai bob = new Samurai();
        Samurai greg = new Samurai();

        bob.displayHealth();
        bob.attack(greg);
    }
}