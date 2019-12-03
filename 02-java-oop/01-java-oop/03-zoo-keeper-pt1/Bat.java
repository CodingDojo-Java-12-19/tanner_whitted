public class Bat extends Mammal {
    public Bat(int energyLevel){
        super(energyLevel);
    }
    public void fly(){
        System.out.println("whoosh");
        energyLevel -= 50;
    }
    public void eatHumans(){
        energyLevel +=25;
    }
    public void attackTown(){
        System.out.println("towns on fire");
        energyLevel -= 100;
    }
}