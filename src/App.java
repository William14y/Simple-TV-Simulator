import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Television television = new Television();
        Scanner menuOption = new Scanner(System.in);
        int menuOpt;

        do {
            System.out.println("\t===TV MENU===\t\n\n" +

                    "\tStatus: " + television.isOnOrOff() + "\n" +
                    "\tActual Volume: " + television.getTotalVolume() + "\n" +
                    "\tActual Channel: " + television.getChannel() + "\n\n" +

                    "\t[1] Turn On\n" +
                    "\t[2] Turn Off\n" +
                    "\t[3] Increase Vol\n" +
                    "\t[4] Down Vol\n" +
                    "\t[5] Change Channel Up\n" +
                    "\t[6] Change Channel Down\n" +
                    "\t[0] Exit");

            menuOpt = menuOption.nextInt();

            switch (menuOpt) {
                case 1:
                    television.setTurnOnOff(true);
                    System.out.println(television.isOnOrOff());
                    break;
                case 2:
                    television.setTurnOnOff(false);
                    System.out.println(television.isOnOrOff());
                    break;
                case 3:
                    System.out.println("How much volume do you want to increase?\n");
                    Scanner scannerVolUp = new Scanner(System.in);
                    int increasedVol = scannerVolUp.nextInt();
                    television.increaseVolume(increasedVol);
                    break;
                case 4:
                    System.out.println("How much volume do you want to turn down?\n");
                    Scanner scannerVolDown = new Scanner(System.in);
                    int turnedDownVol = scannerVolDown.nextInt();
                    television.downVolume(turnedDownVol);
                    break;
                case 5:
                    television.channelUp();
                    break;
                case 6:
                    television.channelDown();
                    break;
                case 0:
                    System.out.println("Closing Program...");
            }


        } while (menuOpt != 0);
        menuOption.close();
    }

}
