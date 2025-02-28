import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /* the method "menuTV" works by controlling the logic of the menu while the methods inside the
           television class serve to store the properties that a television has, we could do this code more complex
           by increasing more things inside the object class "television" but I want to make it simple for now */

        menuTV();

    }


    public static void menuTV(){

        Television television = new Television();

        System.out.println("\t--TV MENU--\t\n\n" +
                "\t[1] Turn On\n" +
                "\t[2] Turn Off\n" +
                "\t[3] Increase Vol\n" +
                "\t[4] Down Vol\n" +
                "\t[5] Change Channel Up\n" +
                "\t[6] Change Channel Down\n" +
                "\t[0] Exit");

        Scanner menuOption = new Scanner(System.in);
        int menuOpt = menuOption.nextInt();

        switch (menuOpt) {
            case 1:
                television.setTurnOnOff(true);
                System.out.println(television.isOnOrOff());
                menuTV();
                break;
            case 2:
                television.setTurnOnOff(false);
                System.out.println(television.isOnOrOff());
                menuTV();
                break;
            case 3:
                System.out.println("How much volume do you want to increase?\n");
                Scanner scannerVolUp = new Scanner(System.in);
                int increasedVol = scannerVolUp.nextInt();
                television.increaseVolume(increasedVol);
                menuTV();
                break;
        }
    }
}
