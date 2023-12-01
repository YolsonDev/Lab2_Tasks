package Zadanie2;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wartość int: ");
        int liczba1 = scanner.nextInt();

        System.out.println("Wprowadz wartość double: ");
        double liczba2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Wprowadz wartość char: ");
        char znak = scanner.next().charAt(0);

        System.out.println("Wprowadz wartość boolean: ");
        boolean wybor = scanner.nextBoolean();

        //duble na int
        int konwertInt1 = (int)Math.round(liczba2);
        System.out.println("Konwersja double na int: " + konwertInt1);

        // int na dubble
        System.out.println("Konwersja int na double: " + (double) liczba1);

        //char na int
        int konwertInt2 = Integer.parseInt(String.valueOf(znak));
        System.out.println("Konwersja char na int: " + konwertInt2);

        // boolean na string
        String konwertBool = String.valueOf(wybor);
        System.out.println("Konwersja boolean na string: " + konwertBool);

        scanner.close();

    }
}
