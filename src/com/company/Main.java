package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String test = "piano";
        int index = indexDeChar(test, 'a');
        System.out.println(index);
        System.out.println(indexDeChar(test,'z'));

        int[] tabInt = {1, -2, 240, 22, -3, 23, 10, 10 , 1 , 99, 125};
        //triBSUp(tabInt);
        triSSSUp(tabInt);
        System.out.println(Arrays.toString(tabInt));

    }

    /**
     * Retourne l'index du caractere chercher dans le texte, si non trouve retourne -1
     * @param texte chaine a parcourir
     * @param carCherche caractere recherche
     * @return retourne lindex du caractere chercher, sinon retourne -1
     */
    public static int indexDeChar(String texte, char carCherche){
        int i = 0; //indice de texte
        boolean trouve = false; //indicateur de recherche
        while (!trouve && i < texte.length()){
         if (texte.charAt(i) == carCherche){
             trouve = true;
         }
         else
             i++;
        }

        if (trouve)
            return i;
        else
            return -1;


    }
    public static void permute(int[] tab, int ind1, int ind2){
        int transit = tab[ind1];
        tab[ind1] = tab[ind2];
        tab[ind2] = transit;

    }
    /*
    public static void triBSUp(int[] tableau){
        for (int i = 0; i < tableau.length - 1; i++)
            for (int j = i+1;j < tableau.length; j++ )
                if (tableau[j] < tableau[i])
                    permute(tableau, j , i);


    }*/


    public static void triSSSUp(int [] tableau){
        int imin; // indice du plus petit

        for (int i = 0; i < tableau.length - 1; i++){
            imin = i;
            for (int j = i+ 1; j<tableau.length; j++){
                if (tableau[j] < tableau[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tableau, i , imin);
        }


    }


}
