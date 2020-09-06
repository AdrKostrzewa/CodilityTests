package com.example.demo;

import java.util.*;

public class OddOccurrencesInArray {
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

    public static void main(String[] args) {
        int [] A = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }
}
