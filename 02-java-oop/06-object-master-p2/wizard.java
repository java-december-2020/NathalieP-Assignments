public class Wizard extends Humann {
    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
        numwizard = ();
    }

    public void heal(Humann target) {
        target.health += this.intelligence;
    }

    public void fireball(Humann target) {
        target.health -= (this.intelligence * 3);
    }

    
}