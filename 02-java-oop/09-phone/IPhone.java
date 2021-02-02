public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ring = getRingTone();
        return ring;
    }
    @Override
    public String unlock() {
        return "unlocking with fringerprint";
    }
    @Override
    public void displayInfo() {
        system.out.println("iPhone" + getVerisonNumber() + "from" + getCarrier());         
    }
}
