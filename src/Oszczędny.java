public class Oszczędny extends Uczestnik {
    private double średniaCenaDotychczas;
    private int ilośćOtrzymanychPropozycji;

    public Oszczędny(int budżet, String pseudonim, double średniaCenaDotychczas, int ilośćOtrzymanychPropozycji) {
        super(budżet, pseudonim);
        this.średniaCenaDotychczas = średniaCenaDotychczas;
        this.ilośćOtrzymanychPropozycji = ilośćOtrzymanychPropozycji;
    }

    public boolean podejmijDecyzję(Przedmiot aktualnyPrzedmiot) {
        if (ilośćOtrzymanychPropozycji == 0) {
            średniaCenaDotychczas = aktualnyPrzedmiot.getCena();
            ilośćOtrzymanychPropozycji++;

            return false;
        } else {
            średniaCenaDotychczas = (średniaCenaDotychczas * ilośćOtrzymanychPropozycji + aktualnyPrzedmiot.getCena()) / (ilośćOtrzymanychPropozycji + 1);
            ilośćOtrzymanychPropozycji++;

            return (średniaCenaDotychczas > aktualnyPrzedmiot.getCena());
        }
    }
}
