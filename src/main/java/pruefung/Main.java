package pruefung;

import java.util.Arrays;

public class Main {

    public static int random() {
        return (int) (Math.random() * 1000);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Raum[] raueme = {new Raum(2), new Raum(1), new Raum(5), new Raum(4), new Raum(6), new Raum(3)};
        //sort(raueme);
        sortDescending(raueme);
    }

    public static void reverseArray() {
        Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(intArray));
        StringBuilder sb = new StringBuilder();
        for (int i = intArray.length - 1; i >= 0; i--) {
            sb.append(intArray[i]).append(", ");
        }
        System.out.println(sb);
    }

    public static void sort(Raum[] raueme) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsortiert: ");
        Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
        System.out.println(sb);
        /*
        ---------------- Eigentliche Aufgabe ----------------
         */
        int counter = 0;
        for (int i = 0; i < raueme.length - 1; i++) {
            for (int j = 0; j < raueme.length - i - 1; j++) {
                counter++;
                if (raueme[j].getBelegung() > raueme[j + 1].getBelegung()) {
                    Raum raum = raueme[j];
                    raueme[j] = raueme[j + 1];
                    raueme[j + 1] = raum;
                }
                sb.setLength(0);
                sb.append(counter).append(". Nach der Änderung: ");
                Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
                System.out.println(sb);
            }
        }
        /*
        ---------------- Eigentliche Aufgabe ----------------
         */
        System.out.println("----------------");
        sb.setLength(0);
        sb.append("Sortiert: ");
        Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
        sb.append(" (").append(counter).append(" Iterationen)");
        System.out.println(sb);
    }

    public static void sortDescending(Raum[] raueme) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsortiert: ");
        Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
        System.out.println(sb);
        for (int i = 0; i < raueme.length - 1; i++) {
            for (int j = 0; j < raueme.length - i - 1; i++) {
                if (raueme[j].getBelegung() > raueme[j + 1].getBelegung()) {
                    Raum raum = raueme[j];
                    raueme[j + 1] = raueme[j];
                    raueme[j] = raum;
                }
            }
        }
        System.out.println("----------------");
        sb.setLength(0);
        sb.append("Sortiert: ");
        Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
        sb.append(" (").append(" Iterationen)");
        System.out.println(sb);
    }
}

class Raum {
    public Raum(int belegung) {
        this.belegung = belegung;
    }

    private final int belegung;

    public int getBelegung() {
        return belegung;
    }
}