package pruefung22;

public class Vergleiche {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(vergleicheMitarbeiter(new Mitarbeiter(3810.0), new Mitarbeiter(3800.0)));
    }

    public static Integer vergleicheMitarbeiter(Mitarbeiter m1, Mitarbeiter m2) {
        double diff = m1.getGehalt() - m2.getGehalt();
        if (diff > 0) return 1;
        if (diff == 0) return 0;
        else return -1;
    }
}
