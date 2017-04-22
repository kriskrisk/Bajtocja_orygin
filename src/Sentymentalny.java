public class Sentymentalny extends Uczestnik{
    private String krajPochodzenia;

    public Sentymentalny(int budżet, String pseudonim, String krajPochodzenia) {
        super(budżet, pseudonim);
        this.krajPochodzenia = krajPochodzenia;
    }

    public boolean podejmijDecyzję(Przedmiot aktualnyPrzedmiot) {
        return (aktualnyPrzedmiot.getKrajPochodzenia().equals(this.krajPochodzenia) && aktualnyPrzedmiot.getCena() <= super.getBudżet());
    }
}
