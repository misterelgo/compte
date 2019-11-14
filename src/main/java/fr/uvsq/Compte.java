package com.codeWithElgo;
import java.util.Scanner;
public class Compte {
    public int solde;

    public Compte(int s){
        this.solde = s;
    }
    public int Initialiser(int SommeInitiale){
        Scanner scan = new Scanner(System.in);
        int sommeInitiale = scan.nextInt();
        solde = sommeInitiale;
        return solde;
    }
    public int Crediter(int d){
        if (d>0)
            this.solde += d;
        else d=0;
        return solde;
    }
    public int Debiter(int r){
        if (this.solde > r)
            this.solde -= r;
        else
            System.out.println("Opération Impossible: Le Compte n'est jamais decouvert");
        return solde;
    }
    public void ConsultationCompte()
    {
        System.out.println("solde : "+this.solde+" Euros");
    }
}
