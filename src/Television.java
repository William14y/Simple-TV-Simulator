import java.util.Scanner;

public class Television {

    private int volume;
    private int channel;
    private boolean turnOnOff;
    private boolean closeMenu;

    public void setTurnOnOff(boolean turnOnOff) {
        this.turnOnOff = turnOnOff;
    }

    public Boolean getTurnOnOff() {
        return turnOnOff;
    }

    public String isOnOrOff() {
        if (getTurnOnOff() == true) {
            return "The tv is on now";
        } else
            return "The tv is off now";
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setCloseMenu(boolean closeMenu) {
        this.closeMenu = closeMenu;
    }

    public boolean getCloseMenu() {
        return closeMenu;
    }

}
