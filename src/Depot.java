public class Depot implements Runnable {
    private CompteBancaire compte;
    private int montant;

    public Depot(CompteBancaire compte, int montant) {
        this.compte = compte;
        this.montant = montant;
    }

    @Override
    public void run() {

        compte.depot(montant);
    }
}
