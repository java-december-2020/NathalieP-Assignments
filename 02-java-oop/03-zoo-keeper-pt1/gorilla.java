public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);

    }
    public void throwSomthing(){
        this.energyLevel -= 5;
        this.displayEnergy();
        System.out.println("Throwing something");
    }
    public void eatBananas(){
        this.energyLevel += 10;
        this.displayEnergy();
        System.out.println("eating bananas ");
    }
    public void climbTree(){
        this.energyLevel -= 10;
        this.displayEnergy();
        System.out.println("Gorilla is climbing a tree");
    }
}