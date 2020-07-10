package com.example.demo;

import javax.swing.plaf.multi.MultiListUI;
import java.lang.reflect.Array;
import java.util.*;


public class CodillityIterations {


    public int solution(int N) {
        String g = Integer.toBinaryString(N);

        List<Character> charList = new ArrayList<Character>();
        for (int i=0; i <= g.length()-1; i++){
            charList.add(g.charAt(i));
        }

        List<Character> zeroList = new ArrayList<Character>();
        List<Integer> collectionOfZeros = new ArrayList<Integer>();


        for (int i = 0; i < charList.size(); i++){
            int lastIndexOfList = charList.size();
            if (i != lastIndexOfList -1) {


                if (charList.get(i) == '1' && charList.get(i + 1) == '0')
                    for (int y = i; y < lastIndexOfList; y++) {
                        char jednoZero = charList.get(y);
                        if (jednoZero == '0') {
                            zeroList.add(jednoZero);

                            if (y != lastIndexOfList -1) {
                                if (charList.get(y + 1) == '1') {
                                    collectionOfZeros.add(zeroList.size());
                                    zeroList.clear();
                                    break;
                                }
                            }
                        }
                    }
            }
        }

        int result = 0;
        if (collectionOfZeros.isEmpty()){
            result = 0;
        }else {
            result = Collections.max(collectionOfZeros);
        }

        return result;
    }

    public static void main(String[] args) {
        int  N = 15   ;
        String g = Integer.toBinaryString(N);

        List<Character> charList = new ArrayList<Character>();
            for (int i=0; i <= g.length()-1; i++){
                        charList.add(g.charAt(i));
                    }

        List<Character> zeroList = new ArrayList<Character>();
        List<Integer> collectionOfZeros = new ArrayList<Integer>();


        for (int i = 0; i < charList.size(); i++){
           int lastIndexOfList = charList.size();
            if (i != lastIndexOfList -1) {


                if (charList.get(i) == '1' && charList.get(i + 1) == '0')
                    for (int y = i; y < lastIndexOfList; y++) {
                        char jednoZero = charList.get(y);
                        if (jednoZero == '0') {
                            zeroList.add(jednoZero);

                            if (y != lastIndexOfList -1) {
                                if (charList.get(y + 1) == '1') {
                                    collectionOfZeros.add(zeroList.size());
                                    zeroList.clear();
                                    break;
                                }
                            }
                        }
                    }
            }
        }
        int result = 0;
      if (collectionOfZeros.isEmpty()){
          result = 0;
        }else {
         result = Collections.max(collectionOfZeros);
      }

        System.out.println(result);
        System.out.println("char list" +charList);
        System.out.println("zero list" +zeroList);


            }
    }


