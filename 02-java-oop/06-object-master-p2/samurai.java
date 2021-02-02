public class Samurai extends Humann {
    private static int numSamurai = 0;
    private static int defaultHealth = 200;
    public static int howMany() {
        return Samurai.numSamurai;
    }
    public Samurai() {
        this.health = Samurai.defaultHealth;
        Samurai.numSamurai += 1;
    }
    public void deathBlow(Humann target) {
        target.health = 0;
        this.health = (this.health/2);
    }
    public void meditate() {
        this.health = Samurai.defaultHealth;
    }
}