package builder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userInput=2;

	    Display kitchen = new Display("Kuchnia");
	    Display room = new Display("Pokój");
	    Display garden = new Display("Ogród");


	    MainClock mainClock = new MainClock();

        Scanner cin = new Scanner(System.in);


        while(userInput!=0) {
            if (cin.hasNextInt())
                userInput = cin.nextInt();


            switch (userInput) {
                case 1://uruchomienie zegara
                    mainClock.run();

                    mainClock.getTime();
                    break;
                case 3:
                    mainClock.addDisplay(kitchen);
                    System.out.println("Dodano wyświetlacz kuchenny");
                    break;
                case 4:
                    mainClock.addDisplay(room);
                    System.out.println("Dodano wyświetlacz pokojowy");
                    break;
                case 5:
                    mainClock.addDisplay(garden);
                    System.out.println("Dodano wyświetlacz ogrodowy");
                    break;
                case 6:
                    mainClock.removeDisplay(kitchen);
                    System.out.println("Usunięto wyświetlacz kuchenny");
                    break;
                case 7:
                    mainClock.removeDisplay(room);
                    System.out.println("Usunięto wyświetlacz pokojowy");
                    break;
                case 8:
                    mainClock.removeDisplay(garden);
                    System.out.println("Usunięto wyświetlacz ogrodowy");
                    break;
            }
        }
        mainClock.stopClock();
        cin.close();
    }
}
