public class mammal {
    int energyLevel = 300;

    public mammal() {
    }
    public mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public int displayEnergy(){
        System.out.println("Energy Level: " + energyLevel);
        return energyLevel;
    }
}