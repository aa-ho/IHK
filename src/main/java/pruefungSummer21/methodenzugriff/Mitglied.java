package pruefungSummer21.methodenzugriff;

interface Mitglied {
    static void setService(String service) {
    }

    static void giveRating(Integer rating) {
    }
}

class Proxy implements Mitglied {
    private RealMitglied mitglied;
    private RealMitglied user;

    public Proxy(RealMitglied mitglied, RealMitglied user) {
        this.mitglied = mitglied;
        this.user = user;
    }

    public boolean isOwner() {
        return true; //sporalisch...
    }

    public static Proxy getInstance(RealMitglied mitglied, RealMitglied user) {
        return new Proxy(mitglied, user);
    }
}

class RealMitglied implements Mitglied {
    private String name;
    private String service;
    private Integer rating;

    public RealMitglied(String name, String service) {
        this.name = name;
        this.service = service;
    }

    public String getName() {
        return "name";
    }

    public String getService() {
        return "service";
    }
}

