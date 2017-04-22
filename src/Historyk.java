public class Historyk extends Uczestnik{
    private int ulubionyOkres;

    public Historyk(int budżet, String pseudonim, int ulubionyOkres) {
        super(budżet, pseudonim);
        this.ulubionyOkres = ulubionyOkres;
    }

    public boolean podejmijDecyzję(Przedmiot aktualnyPrzedmiot) {
        return (aktualnyPrzedmiot.getRokProdukcji() == this.ulubionyOkres && aktualnyPrzedmiot.getCena() <= super.getBudżet());
    }
}
