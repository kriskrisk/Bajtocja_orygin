public class Przedmiot {
    private int rokProdukcji;
    private String krajPochodzenia;
    private int cena;

    public Przedmiot(int rokProdukcji, String krajPochodzenia, int cena) {
        this.rokProdukcji = rokProdukcji;
        this.krajPochodzenia = krajPochodzenia;
        this.cena = cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public int getCena() {
        return cena;
    }
}
