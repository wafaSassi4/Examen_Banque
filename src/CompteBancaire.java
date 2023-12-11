import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CompteBancaire {
    private int solde;
    private double montant;

    public CompteBancaire(int solde) {
        this.solde = solde;
        System.out.println("solde initial est:" +solde);
    }
    synchronized void retrait(double montant){
        if(montant>solde){
            try {
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
        solde-=montant;
        System.out.println(Thread.currentThread().getName()+"Retrait de "+montant+" nouveau solde est "+solde);
        notify();

   }
    synchronized void depot(double montant){

        solde+=montant;
        System.out.println(Thread.currentThread().getName()+"Retrait de "+montant+" nouveau solde est "+solde);
        notify();

    }


}