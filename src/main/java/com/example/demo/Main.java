package com.example.demo;

import java.util.HashMap;
import java.util.*;

 class Gady{
    int dystans;
   void   skacz(String s){

  }
    public Gady(){}
    public Gady (int dystans){
        this.dystans = dystans;
    }



}
class    Zaba  extends Gady {



    void skacz(Object s) {
        System.out.println(s + " siup");
    }




}


public class Main {


     static void iteratorListy (){


        }




    public static void main(String[] args) {

        List <String> list = new LinkedList<>();
        list.add("drzewo");
        list.add("drzewo2");
        list.add("drzewo3");
        wypiszListe(list);

    }

    public static void wypiszListe (List list){
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
