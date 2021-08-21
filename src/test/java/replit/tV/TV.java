package replit.tV;

public class TV {

    int channel = 1;
    int volumeLevel = 0;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand) {
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if ((channel < 1 || channel > 120) || !isOn()) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            this.channel = channel;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if ((volumeLevel < 0 || volumeLevel > 7) || !isOn()) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            this.volumeLevel = volumeLevel;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        setChannel(++channel);
    }

    public void channelDown(){
        setChannel(--channel);
    }

    public void volumeUp(){
        setVolumeLevel(++volumeLevel);
    }

    public void volumeDown(){
        setVolumeLevel(--volumeLevel);
    }

    public boolean isOn(){
    return on;
    }

    public void turnOn(){
        if(isOn()){
            System.out.println("Tv is already on");
        }else{
            on = true;
        }
    }

    public void turnOff(){
        if(isOn()){
            on = false;
        }else{
            System.out.println("TV is already off");
        }
    }



}
