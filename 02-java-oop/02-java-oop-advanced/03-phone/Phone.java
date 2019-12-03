public abstract class Phone {
    private String versionNumber;
    private int batteryLife;
    private String carrier;
    private String ringtone;

    public String getRingtone(){
        return this.ringtone;
    }

    public int getBatteryLife(){
        return this.batteryLife;
    }

    public String getCarrier(){
        return this.carrier;
    }
    
    public String getVersionNumber(){
        return this.versionNumber;
    }

    public Phone(String versionNumber, int batteryLife, String carrier, String ringtone){
        this.versionNumber = versionNumber;
        this.batteryLife = batteryLife;
        this.carrier = carrier;
        this.ringtone = ringtone;
    }




    public abstract void displayInfo();
}
