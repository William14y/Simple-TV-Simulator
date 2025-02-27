import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /* the method "menuTV" works by controlling the logic of the menu while the methods inside the
           television class serve to store the properties that a televsion has, we could do this code more complex
           by increasing more things inside the object class "television" but i want to make it simple for now */

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
        Integer menuOpt = menuOption.nextInt();

        if (menuOpt == 1) {
            television.setTurnOnOff(true);
            System.out.println(television.isOnOrOff());
            menuTV();
        } else if (menuOpt == 2) {
            television.setTurnOnOff(false);
            System.out.println(television.isOnOrOff());
            menuTV();
        }
    }
}
