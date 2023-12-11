public class Retrait implements Runnable {
    private CompteBancaire compte;
    private double montant;

    public Retrait(CompteBancaire compte, double montant) {
        this.compte = compte;
        this.montant=montant;
    }

    @Override
    public void run() {

        compte.retrait(montant);
    }
}
