package pruefung;

import java.util.Arrays;

public class Sortierung {
    public static void main(String[] args) {
        System.out.println("test");
        Raum[] raueme = {new Raum(2), new Raum(1), new Raum(5), new Raum(4), new Raum(6), new Raum(3)};
        sort(raueme);
    }

    public static void sort(Raum[] raueme) {
        for (int i = 0; i < raueme.length - 1; i++) {
            for (int j = 0; j < raueme.length - i - 1; j++) {
                if (raueme[j].getBelegung() > raueme[j + 1].getBelegung()) {
                    Raum raum = raueme[j];
                    raueme[j] = raueme[j + 1];
                    raueme[j + 1] = raum;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        Arrays.stream(raueme).forEach(raum -> sb.append(raum.getBelegung()).append(", "));
        System.out.println(sb);
    }
}
