public class Ninja extends Humann {
    public Ninja() {
        this.stealth = 10;
        numninja = ();
    }
    public void steal(Human target) {
        target.health -= this.stealth;
        this.health += this.stealth;
    } 
    public void runAway() {
        this.health -= 10;
    }
}