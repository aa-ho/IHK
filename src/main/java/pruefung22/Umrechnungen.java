package pruefung22;

public class Umrechnungen {
    public static void main(String[] args) {
        System.out.println("Test");
        umrechnungFalsch(11);
        System.out.println("-----------------------");
        System.out.println(decimalToBinary(11));
    }

    /*
    Aufgabenstellung mit Fehlern!
     */
    public static void umrechnungFalsch(int dezimalzahl) {
        int rest;
        rest = dezimalzahl % 2;
        System.out.println(rest);
        dezimalzahl = dezimalzahl / 2;
        if (dezimalzahl > 0) {
            umrechnungFalsch(dezimalzahl);
        }
    }

    public static String decimalToBinary(int dezimahl) {
        String binary = "";
        System.out.println(binary);
        while (dezimahl > 0) {
            int rest = dezimahl % 2;
            binary = rest + binary;
            dezimahl = dezimahl / 2;
            System.out.println(binary);
        }
        return binary;
    }
}