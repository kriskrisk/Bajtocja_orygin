abstract public class Uczestnik {
    private int budżet;
    private String pseudonim;

    public Uczestnik(int budżet, String pseudonim) {
        this.budżet = budżet;
        this.pseudonim = pseudonim;
    }

    public int getBudżet() {
        return budżet;
    }

    public String getPseudonim() {
        return pseudonim;
    }

    abstract public boolean podejmijDecyzję(Przedmiot aktualnyPrzedmiot);
}
