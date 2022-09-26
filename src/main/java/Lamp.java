public class Lamp {
    private String name;
    private boolean turnedOnOff;

    public Lamp(String navn, boolean turnedOnOff) {
        this.name = navn;
        this.turnedOnOff = turnedOnOff;
    }

    public Lamp(String name) {
        this.turnedOnOff = false;
        this.name = name;
    }

    public void turnedOnOff() {
        turnedOnOff = true;
    }

    public void turnOff() {
        turnedOnOff = false;
    }

    public void toggle() {
        if (turnedOnOff == false)
            turnedOnOff = true;
        else
            turnedOnOff = false;
    }

    public boolean isOn() {
        return turnedOnOff;
    }

    public String toString(){
        String text;
        if (turnedOnOff == true)
            text = "turned on";
        else
            text = "turned off";
        return name + turnedOnOff;
    }
}
