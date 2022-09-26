import java.util.Scanner;

public class LampToggle {
    public static void man(String[] args) {
        Lamp l1 = new Lamp("Lamp1");
        Lamp l2 = new Lamp("Lamp2");
        Lamp l3 = new Lamp("Lamp3");
        Lamp l4 = new Lamp("Lamp4");
        Lamp l5 = new Lamp("Lamp5");

        Lamp selectedLamp = null;

        Scanner scan = new Scanner(System.in);

            int valg = 0;
        do {
            System.out.println(l1);
            System.out.println(l2);
            System.out.println(l3);
            System.out.println(l4);
            System.out.println(l5);

            System.out.println("Which lamp should be turned on (0 to exit)");
            if(scan.hasNextInt())
                valg = scan.nextInt();
            else valg =0;

            if (valg > 0 && valg <= 5)

            if (valg == 1)
                selectedLamp = l1;
            else if (valg == 2)
                selectedLamp = l2;
            else if (valg == 3)
                selectedLamp = l3;
            else if (valg == 4)
                selectedLamp = l4;
            else if (valg == 5)
                selectedLamp = l5;

            selectedLamp.toggle();

        } while (valg != 0);
    }
}
