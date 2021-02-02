public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ring = getRingTone();
        return ring;
    }
    @Override
    public String unlock() {
        String unlock = getUnlock();
        return "unlocking with fringerprint";
    }
    @Override
    public void displayInfo() {
        system.out.println("Galaxy" + getVerisonNumber() + "from" + getCarrier());         
    }
}
