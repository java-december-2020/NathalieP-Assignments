public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public abstract void displayInfo();
    //getters and setter
    public String getVersionNumber(){
        return versionNumber; 
    }
    public String getBatteryPercentage(){
        return batteryPercentage;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getRingTone(){
        return RingTone;
    }
    public void setVersionNumber(String versionNumber){
        this.versionNumber = verisonNumber;
    }
    public void setBatteryPercentage(String batteryPercentage){
        this.BatteryPercentage = batteryPercentage;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setRingTone(String RingTone){
        this.RingTone = RingTone;
    }
}