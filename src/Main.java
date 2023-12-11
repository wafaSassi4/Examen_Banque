//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000);
        Retrait R1 = new Retrait(compte, 1200);
        Depot D1 = new Depot(compte, 150);
        Thread thr1= new Thread(R1);
        Thread thr2= new Thread(D1);

        thr1.setName("Retrait");
        thr2.setName("depot");
        thr1.start();
        thr2.start();
    }
}