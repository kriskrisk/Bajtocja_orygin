import java.util.Random;

public class Losowy extends Uczestnik {

    public Losowy(int budżet, String pseudonim) {
        super(budżet, pseudonim);
    }

    public boolean podejmijDecyzję(Przedmiot aktualnyPrzedmiot) {
        Random r = new Random();
        boolean rzutMonetą = r.nextBoolean();

        return (rzutMonetą && aktualnyPrzedmiot.getCena() <= super.getBudżet());
    }
}
