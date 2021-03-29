package com.pierre.meignen;

public class Math {

    public static void main(String[] args) {

        System.out.println("1 : programme d'addition ");
        System.out.println("2 : programme de soustraction ");
        System.out.println("3 : utiliser resulat de addition en parametre de la soustraction");
        System.out.println("4 : programe extraction de chiffres impaires d'une liste");
        System.out.println();

        addition();
        substraction();
        int dif = substraction();
        paramAddInSub(dif);
        extractImpFromList();

    }

    // TODO : Créer une méthode addition qui prend en paramètre deux entiers et retourne la somme de ces deux entiers
    public static void addition (){

        int x = 1;
        int y = 2;
        int somme;

        somme = x + y;

        System.out.println("resultat programme d'addition x + y ");
        System.out.println(x + " + " + y + " = " + somme);
    }

    // TODO : Créer une méthode substraction qui prend en paramètre deux entiers et retourne la soustraction de ces deux entiers
    public static int substraction (){

        int a = 10;
        int b = 5;
        int dif;

        dif = a - b;

        System.out.println("resultat programme de soustraction a - b");
        System.out.println(a + " - " + b + " = " + dif);

        return dif;

    }

    // TODO : Utiliser le résultat de la méthode addition dans l’un des paramètres de la méthode substraction
    public static void paramAddInSub(int dif) {


        int c = 100;
        int difAddInSub =0;

        difAddInSub = dif - c ;

        System.out.println("resultat du programme d'utilisation du résulat de l' addition en parametre de la soustraction dif - c ");
        System.out.println(dif + " - " + c + " = " + difAddInSub);
    }

    // TODO : Créer une méthode qui prend en paramètre une liste de chiffre, et qui te retourne une nouvelle liste de chiffres composée uniquement des chiffres impairs

    private static void extractImpFromList() {

    }

}









