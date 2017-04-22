public class Licytator {

    public Licytator() {
    }

    private Uczestnik[] przestawNaKoniec(Uczestnik[] tabUczestników, int numerDoPrzestawienia) {
        int ilośćuczestników = tabUczestników.length;
        Uczestnik doPrzestawienia = tabUczestników[numerDoPrzestawienia];

        for (int i = numerDoPrzestawienia; i < ilośćuczestników - 1; i++) {
            tabUczestników[i] = tabUczestników[i + 1];
        }

        tabUczestników[ilośćuczestników - 1] = doPrzestawienia;

        return tabUczestników;
    }

    public Uczestnik[] przeprowadź(Przedmiot[] tabPrzedmiotów, Uczestnik[] tabUczestników) {
        int ilośćPrzedmiotów = tabPrzedmiotów.length;
        Uczestnik[] kupionePrzedmioty = new Uczestnik[ilośćPrzedmiotów];

        for (int i = 0; i < ilośćPrzedmiotów; i++) {
            boolean czyKtośChciał = false;
            int j = 0;

            while(!czyKtośChciał) {
                if(tabUczestników[j].podejmijDecyzję(tabPrzedmiotów[i])) {
                    czyKtośChciał = true;
                    kupionePrzedmioty[i] = tabUczestników[j];
                    tabUczestników = przestawNaKoniec(tabUczestników, j);
                }

                j++;
            }

            if (!czyKtośChciał) {
                kupionePrzedmioty[i] = null;
            }
        }

        return kupionePrzedmioty;
    }
}
