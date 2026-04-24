package section14_oop;

public class Portable_Console {
    private String name;
    private int mhBattery;
    private int screens;
    private boolean isOn;

    public Portable_Console(){
        setName("Generic Console");
        setMhBattery(2000);
        setScreens(1);
        isOn = false;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getMhBattery(){
        return mhBattery;
    }
    public void setMhBattery(int mhBattery){
        if (mhBattery > 0) {
            this.mhBattery = mhBattery;
        } else {
            this.mhBattery = 0;
        }
    }

    public int getScreens(){
        return screens;
    }
    public void setScreens(int screens){
        if (screens > 0 && screens < 3){
            this.screens = screens;
        } else {
            this.screens = 0;
        }
    }

    public boolean getPower(){
        return isOn;
    }

    public void turnOn(){
        if (!isOn){
            isOn = true;
        } else {
            System.out.println("Your console is already on!");
        }
    }

    public void turnOff(){
        if (isOn){
            isOn = false;
        } else {
            System.out.println("Your console is already off!");
        }
    }

    public String getStatus(){
        if (isOn){
            return "Is on";
        } else {
            return "Is off";
        }
    }

    public void printSystemSettings(){
        System.out.println("Console Name: " + getName());
        System.out.println("Battery Size: " + getMhBattery() + "mh");
        System.out.println("Number of Screens: " + getScreens());
        System.out.println("Status: " + getStatus());
    }
}
