package com.codeWithElgo;
import com.codeWithElgo.Compte;
public class Main {

    private static void Virement(Compte compte1, Compte compte2, int v) {
        compte1.Debiter(v);
        compte2.Crediter(v);
    }
    public static void main(String[] args) {
        Compte compte1 = new Compte(0);
        compte1.Initialiser(5000);
        //compte1.Crediter(-2000);
        compte1.Debiter(1000);
        compte1.ConsultationCompte();

        Compte compte2 = new Compte(25000);
        Virement(compte2, compte1, 2000);
        //compte1.ConsultationCompte();
        //compte2.ConsultationCompte();
    }


}
