import java.util.Scanner;

public class Television {

    private int volume;
    private int channel;
    private boolean turnOnOff;

    public void setTurnOnOff(boolean turnOnOff) {
        this.turnOnOff = turnOnOff;
    }

    public Boolean getTurnOnOff() {
        return turnOnOff;
    }







    public String menu(){
        return "\t--TV MENU--\t\n\n" +
                "\t[1] Turn On\n" +
                "\t[2] Turn Off\n" +
                "\t[3] Increase Vol\n" +
                "\t[4] Down Vol\n" +
                "\t[5] Change Channel Up\n" +
                "\t[6] Change Channel Down\n";
    }



}
