package pruefung22;

class Raum {
    public Raum(int belegung) {
        this.belegung = belegung;
    }

    private final int belegung;

    public int getBelegung() {
        return belegung;
    }
}