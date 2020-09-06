package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibriumPauliny {
    public static int solution(int[] A) {
        int sumLeft = 0;
        int sumRight = 0;
        int result = 0;
        int P = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i<P){
                sumLeft=+ A[i];
            } else {
                sumRight=+A[i];
            }
            P++;
            result = Math.abs(sumLeft-sumRight);
            list.add(result);
        }
        return Collections.min(list);
    }

    public static void main(String[] args) {
        int [] A = {3,1,2,4,3};
        System.out.println(solution(A));;


    }
}
