public class PhoneTester{
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9",101,"Verizon","ring ring"); 
        IPhone IphoneTen = new IPhone("X", 99, "AT&T", "Zing");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        IphoneTen.displayInfo();
        System.out.println(IphoneTen.ring());
        System.out.println(IphoneTen.unlock());
    }
}