public class Wizard extends Human {
    public int health = 50;
    public int intelligence = 8;

    public void heal(Human target){
        target.health += this.intelligence;
    }
    public void attack(Human target){
        target.health -= this.intelligence * 3;
    }
}