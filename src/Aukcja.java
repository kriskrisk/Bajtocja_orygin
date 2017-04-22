public class Aukcja {
    private Licytator licytator;
    private Uczestnik[] uczestnicyAukcji;
    private Przedmiot[] przedmiotyZAukcji;

    public Aukcja(Licytator licytator, Uczestnik[] uczestnicyAukcji, Przedmiot[] przedmiotyZAukcji) {
        this.licytator = licytator;
        this.uczestnicyAukcji = uczestnicyAukcji;
        this.przedmiotyZAukcji = przedmiotyZAukcji;
    }
}
