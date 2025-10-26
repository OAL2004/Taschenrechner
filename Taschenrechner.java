package üb;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// für die eingabe
        boolean laufen = true;

        System.out.println("=== Einfacher Taschenrechner ===");

        while(laufen) {
            System.out.println("\nWähle eine Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraktion (-)");
            System.out.println("3. Multiplikation (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Beenden");
            System.out.print("Option wählen: ");
            int auswahl = sc.nextInt();

            if(auswahl == 5) {
                System.out.println("Taschenrechner beendet.");
                laufen = false;
                break;
            }

            System.out.print("Erste Zahl: ");
            double zahl1 = sc.nextDouble();
            System.out.print("Zweite Zahl: ");
            double zahl2 = sc.nextDouble();

            switch(auswahl) {
                case 1:
                    System.out.println("Ergebnis: " + (zahl1 + zahl2));
                    break;
                case 2:
                    System.out.println("Ergebnis: " + (zahl1 - zahl2));
                    break;
                case 3:
                    System.out.println("Ergebnis: " + (zahl1 * zahl2));
                    break;
                case 4:
                    if(zahl2 != 0)
                        System.out.println("Ergebnis: " + (zahl1 / zahl2));
                    else
                        System.out.println("Fehler: Division durch 0 nicht erlaubt!");
                    break;
                default:
                    System.out.println("Ungültige Auswahl!");
            }
        }

        sc.close();
    }
}