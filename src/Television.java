public class Television {

    private int totalVolume;
    private int channel;
    private boolean turnOnOff;

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

    public void initialVol(){
        this.totalVolume = 0;
    }

    public void increaseVolume(int vol) {
        this.totalVolume += vol;
        System.out.println("Volume level turned to: " + getTotalVolume());
    }

    public void downVolume(int vol) {
        this.totalVolume -= vol;
        System.out.println("Volume level turned to: " + getTotalVolume());
    }

    public int getTotalVolume() {
        return totalVolume;
    }

}
