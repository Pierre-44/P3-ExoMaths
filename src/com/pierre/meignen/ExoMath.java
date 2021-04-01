package com.pierre.meignen;



import java.util.Arrays;
import java.util.List;

public class ExoMath {

    public static void main(String[] args) {

        System.out.println("1 : programme d'addition ");
        System.out.println("2 : programme de soustraction ");
        System.out.println("3 : utiliser resulat de addition en parametre de la soustraction");
        System.out.println("4 : programe extraction de chiffres impaires d'une liste");
        System.out.println(" ");

        //appel metodes et affichage des résultats
        int resuladd = addition(1, 2);
        System.out.println("1: resultat programme d'addition :");
        System.out.println("    1 + 2 = " + resuladd);

        int resultsub = substraction(1000, 100);
        System.out.println("2: resultat programme de soustraction :");
        System.out.println("    1000 - 100 = " + resultsub);

        paramAddInSub();

        extractImpFromList();

    }

    // TODO : Créer une méthode addition qui prend en paramètre deux entiers et retourne la somme de ces deux entiers
    public static int addition(int x, int y) {

        int somme = x + y;

        return somme;
    }

    // TODO : Créer une méthode substraction qui prend en paramètre deux entiers et retourne la soustraction de ces deux entiers
    public static int substraction(int a, int n1) {

        int dif = a - n1;

        return dif;

    }


    // TODO : Utiliser le résultat de la méthode addition dans l’un des paramètres de la méthode substraction
    public static void paramAddInSub() {

        int resultadd = addition(1, 2);

        int resultaddinsub = substraction(1000, resultadd);

        System.out.println("3: resultat programme d'utilisation du résulat de l' addition en parametre de la soustraction :");
        System.out.println("    dif - c : " + resultaddinsub);

    }

    // TODO : Créer une méthode qui prend en paramètre une liste de chiffre, et qui te retourne une nouvelle liste de chiffres composée uniquement des chiffres impairs
    public static void extractImpFromList() {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> myListfiltred = Arrays.asList();

        //return myList.get();
        //{
        //    if (% 2 == 0)
        //    else(% 2 != 0)
        //}


        System.out.println("4: résultat du programme d'extraction des nombre impaire d'une liste :");
        System.out.println("    liste avant filtrage : " + myList.toString());
        System.out.println("    liste filtré par les impairs : " + myListfiltred.toString());



    }
}









