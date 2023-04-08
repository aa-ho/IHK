package pruefung;

import java.util.Arrays;

public class Main {

    public static int random() {
        return (int) (Math.random() * 1000);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Raum[] raueme = new Raum[20];
        for (int i = 0; i < raueme.length; i++) {
            raueme[i] = new Raum(random());
        }
        sort(raueme);
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
        Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
        System.out.println(sb);
        for()
        System.out.println("----------------");
        sb.setLength(0);
        Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
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