package codeSignal;

import java.util.*;

//https://app.codesignal.com/interview-practice/task/pMvymcahZ8dY4g75q

    public class FirstDuplicate {

        static int firstDuplicate(int[] a) {
            Map<Integer, Integer> mapa = new LinkedHashMap<>();

            for (int i = 0; i < a.length; i++) {
                if (mapa.containsKey(a[i])) {
                    return a[i];

                } else {
                    mapa.put(a[i], 1);
                }
            }


            return -1 ;
        }


//static int firstDuplicate(int[] a) {
//    Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
//
//for(int i = 0; i < a.length; i++){
//        int value = a[i];
//        if(ht.put(value, value) != null){
//            return value;
//        }
//    }
//
//return -1;
//}

        public static void main (String[]args){
//            int[] a = {2, 1, 3, 5, 3, 2};
            int[] a = {2, 1, 3, 5, 3, 2};

            System.out.println(firstDuplicate(a));

        }

    }


