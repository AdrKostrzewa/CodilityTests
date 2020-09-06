package com.example.demo;

import java.util.*;

public class OddOccurrencesInArrayPauliny {

    public static int solution(int[] A){
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
        int [] A = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }
}
