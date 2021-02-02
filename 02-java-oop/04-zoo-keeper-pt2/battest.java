public class BatTest {
    public static void main(String[] args) {
        Bat Dak = new Bat();
        Dak.displayEnergy();

        Dak.attackTown("Richardson");
        Dak.eatHumans();
        Dak.fly();
        Dak.attackTown("North Hollywood");
        Dak.eatHumans();
        Dak.fly();
        Dak.attackTown("Los Angeles");
        Dak.displayEnergy(); 
    }
}