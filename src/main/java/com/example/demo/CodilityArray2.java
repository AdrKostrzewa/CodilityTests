package com.example.demo;

import java.lang.reflect.Array;
import java.util.*;

public class CodilityArray2 {

    public static int solution(int[] A) {
        List<Integer> list = new ArrayList<Integer>(A.length);
        for (int a : A)
        {
            list.add(a);
        }



        for(int i= 0 ; i < list.size()-1; i++){
            for(int k = list.size() - 1 ; k > 0 ; k--){
                if(list.get(i).equals(list.get(k))  ){
                    list.remove(k);
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        int a = list.get(0);
return  a;
    }

    public static int solutionPaulina(int[] A){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <A.length ; i++) {
            if (map.containsKey(A[i])){
                int value = map.get(A[i]) +1;
                map.replace(A[i], value);
            } else map.put(A[i],1);
        }
        int result =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()%2!=0){
                result= entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int [] tab = {9,3,9,3,9,7,9};
//        System.out.println(solution(tab));
        int temp = 0;
        int[] A = {1231,123123, 1231, 1, 123, 123, 13, 13,123123};
        System.out.println(solution(A));

            List<Integer> list = new ArrayList<Integer>(A.length);
            for (int a : A)
            {
                list.add(a);
            }



//        for(int i= 0 ; i < list.size()-1; i++){
//            for(int k = list.size() - 1 ; k > 0 ; k--){
//                if(list.get(i).equals(list.get(k))  ){
//                   list.remove(k);
//                   list.remove(i);
//                   i--;
//                  break;
//                }
//            }
//        }


        System.out.println(list);


solutionPaulina(A);


    }
}

