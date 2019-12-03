public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingtone();
    }
    @Override
    public String unlock() {
        return "unlocked with print scanner";
    }
    @Override
    public void displayInfo() {
        System.out.println("Version Number: " + this.getVersionNumber());        
        System.out.println("Battery Life: " + this.getBatteryLife());        
        System.out.println("Carrier: " + this.getCarrier());        
        System.out.println("Ringtone: " + this.getRingtone());        
    }
}
