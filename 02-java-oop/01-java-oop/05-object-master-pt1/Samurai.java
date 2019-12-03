public class Samurai extends Human {
    private static int samHealth = 200;
    private static int samCount = 0;

    public Samurai() {
        this.health = samHealth;
        Samurai.samCount += 1;
    }

    public void deathBlow(Human target) {
        target.health = 0;
        this.health = this.health / 2;
    }
    public void meditate() {
        this.health += this.health * .5;
    }
    public void howMany() {
        System.out.println("There are a few Samurai");
    }
    public int displayHealth(){
		System.out.println("Health: " + health);
		return health;
    }
}