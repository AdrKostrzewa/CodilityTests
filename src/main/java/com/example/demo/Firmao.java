package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Firmao {


    public final  List solution (int [] tab){
        List <Integer> result = new ArrayList<>();
        List <Integer> result2 = new ArrayList<>();
        List <Integer> listUjemna = new ArrayList<>();
        List <Integer> listDodatnia = new ArrayList<>();
        int suma = 0;
        for (int i = 0; i<tab.length; i++){
            for (int y = 0; y<tab.length; y++){
                if (tab[i]!=tab[y]) {
                    suma = tab[i] + tab[y];
                    if (suma <0){
                        listUjemna.add(suma);
                        if (suma == Collections.max(listUjemna)){
                            result.clear();
                            result.add(suma);
                            result.add(tab[i]);
                            result.add(tab[y]);}
                    }else {
                        listDodatnia.add(suma);
                        if (suma == Collections.min(listDodatnia)){
                            result.clear();

                            result.add(suma);}
                        result.add(tab[i]);
                        result.add(tab[y]);
                    }
                }
            }
        }



        return result;
    }

    public static void main(String[] args) {
        List <Integer> result = new ArrayList<>();
        List <Integer> result2 = new ArrayList<>();
        List <Integer> listUjemna = new ArrayList<>();
        List <Integer> listDodatnia = new ArrayList<>();
        int [] tab = {13, 6, -3, -7, 2};
        int suma = 0;
        for (int i = 0; i<tab.length; i++){
            for (int y = 0; y<tab.length; y++){
                if (tab[i]!=tab[y]) {
                    suma = tab[i] + tab[y];
                   if (suma <0){
                       listUjemna.add(suma);
                       if (suma == Collections.max(listUjemna)){
                       result.clear();
                       result.add(suma);
                       result.add(tab[i]);
                       result.add(tab[y]);}
                   }else {
                       listDodatnia.add(suma);
                       if (suma == Collections.min(listDodatnia)){
                           result.clear();

                       result.add(suma);}
                       result.add(tab[i]);
                       result.add(tab[y]);
                   }
                }
            }
        }
        System.out.println(result);

    }
}
