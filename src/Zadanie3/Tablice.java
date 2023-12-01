package Zadanie3;


import java.util.*;
import java.util.stream.Stream;


public class Tablice {
    public static void main(String[] args) {
        int[] tablica1 = { 1, 3, 4, 5, 6, 7 };
        int[] tablica2 = { 9, 13, 15, 15, 23 };

        int sum = Arrays.stream(tablica1).sum();
        System.out.println("Suma elementów w tablicy: " + sum);

        int max = Arrays.stream(tablica1).max().getAsInt();
        int min = Arrays.stream(tablica1).min().getAsInt();
        System.out.println("Maksymmalna wartość tablicy1: " + max +
                            "\nMinimalna wartość tablicy1: " + min);

        double average = Arrays.stream(tablica1).average().getAsDouble();
        System.out.println("Średnia wszystkich wartości tablic1 wynosi: " + average);

        // Utwórz kopię istniejącej tablicy bez użycia pętli.
        int[] tablica3 = Arrays.copyOf(tablica1, tablica1.length);

        // Wybierz elementy z tablicy, które spełniają określone kryterium (np. większe od
        // pewnej wartości) i utwórz nową tablicę na ich podstawie.

        int[] tablica4 = Arrays.copyOfRange(tablica1, 2, 4);

        // Usuń określony element z tablicy i utwórz nową tablicę bez tego elementu.

        int usunLiczbe = 6;
        int[] tablica5 = Arrays.stream(tablica1).filter(element -> element != usunLiczbe).toArray();

        // Połącz tablice 1 i 2 a wynik zapisz w nowej tablicy
        int zliczaj = tablica1.length + tablica2.length;
        int[]tablicaLaczona = Arrays.copyOfRange(tablica1, 0, zliczaj);
        for(int i = 0;i < tablica2.length; i++ ){
            tablicaLaczona[tablica1.length + i] = tablica2[i];
        }

        // Sprawdzenie czy tablice się połączyły
        System.out.print("Tablica łączona(tablica1 i tablica2): ");
        for( int index : tablicaLaczona){
            System.out.print(index  + " ");
            }
        // Znajdź liczbę wystąpień określonej wartości w tablicy 2
        int szukana = 15;
        long liczbaWystapien = Arrays.stream(tablica2).filter(element -> element == szukana).count();
        System.out.println("\nLiczba wystąpień liczby " + szukana + " w tablicy 2: " + liczbaWystapien);

    }
}
