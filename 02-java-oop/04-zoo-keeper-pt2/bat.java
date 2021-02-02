public class Bat extends mammal {

	public Bat(int energyLevel) {
		super(300);
	}
	public void fly() {
		System.out.println("chirps,chirps,chirps");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("eating humans");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("bats attacking the town creating fires");
		energyLevel -= 100;
	}
}