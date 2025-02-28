public class Television {

    private int totalVolume;
    private int channel;
    private boolean turnOnOff;

    public Television() {
        this.totalVolume = 0;
        this.channel = 0;
        this.turnOnOff = turnOnOff;
    }

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

    public void increaseVolume(int vol) {
        if (vol > 0) {
            this.totalVolume += vol;
            System.out.println("The volume turned to: " + this.totalVolume);
        }
    }

    public void downVolume(int vol) {
        if (vol > 0 && vol <= this.totalVolume) {
            this.totalVolume -= vol;
            System.out.println("The volume turned to:  " + this.totalVolume);
        }
    }

    public int getTotalVolume() {
        return totalVolume;
    }


    public void channelUp() {
        if (this.channel <= 100) {
            this.channel += 1;
            System.out.println("Actual Channel: " + this.channel);
        }
    }

    public void channelDown() {
        if (this.channel >= 0) {
            this.channel -= 1;
            System.out.println("Actual Channel: " + this.channel);
        }
    }

    public int getChannel() {
        return channel;
    }


}
