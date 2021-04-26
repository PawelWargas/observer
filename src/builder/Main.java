package builder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userInput = 2;
        int firstRun = 0;

	    Display kitchen = new Display("Kuchnia ");
	    Display room = new Display("Pokój ");
	    Display garden = new Display("Ogród ");


	    MainClock mainClock = new MainClock();

        Scanner cin = new Scanner(System.in);
        System.out.println("Menu\n1. Włącz zegar \n2. Dodaj zegar kuchenny \n3. Dodaj zegar pokojowy \n4. Dodaj zegar ogrodowy ");
        System.out.println("5. Usuń zegar kuchenny\n6. Usuń zegar pokojowy \n7. Usuń zegar ogrodowy \n8. Zatrzymaj zegar \n0. Wyjście");

        while(userInput!=0) {
            if (cin.hasNextInt())
                userInput = cin.nextInt();


            switch (userInput) {
                case 1://uruchomienie zegara
                    if(firstRun==0){
                        mainClock.start();

                        firstRun++;
                    }else{
                        mainClock.reStart();
                    }
                    System.out.println("Uruchomiono zegar");
                    break;
                case 2:
                    mainClock.addDisplay(kitchen);
                    System.out.println("Dodano wyświetlacz kuchenny");
                    break;
                case 3:
                    mainClock.addDisplay(room);
                    System.out.println("Dodano wyświetlacz pokojowy");
                    break;
                case 4:
                    mainClock.addDisplay(garden);
                    System.out.println("Dodano wyświetlacz ogrodowy");
                    break;
                case 5:
                    mainClock.removeDisplay(kitchen);
                    System.out.println("Usunięto wyświetlacz kuchenny");
                    break;
                case 6:
                    mainClock.removeDisplay(room);
                    System.out.println("Usunięto wyświetlacz pokojowy");
                    break;
                case 7:
                    mainClock.removeDisplay(garden);
                    System.out.println("Usunięto wyświetlacz ogrodowy");
                    break;
                case 8:
                    mainClock.stopClock();
                    System.out.println("Zatrzymano zegar");
                    break;

            }
        }

        mainClock.exit();
        cin.close();
    }
}
