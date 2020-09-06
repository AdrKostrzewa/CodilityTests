package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirmaoPauliny {
    public static List<Integer> solution(int[] A) {
        List<Integer> sums = new ArrayList<>();
        List<Integer> firstNumbers = new ArrayList<>();
        List<Integer> secondNumbers = new ArrayList<>();
        int sum =0;
        for (int i = 0; i <A.length ; i++) {
            for (int j = i+1; j <A.length ; j++) {
                sum=A[i]+A[j];
                sums.add(sum);
                firstNumbers.add(A[i]);
                secondNumbers.add(A[j]);
            }
        }
        List<Integer> sumsAbs = new ArrayList<>();
        for (int i = 0; i < sums.size(); i++) {
            sumsAbs.add( Math.abs(sums.get(i)) );
        }
        int resultSum = Collections.min(sumsAbs);
        int index= sums.indexOf(resultSum);
        List<Integer> result = new ArrayList<>();
        result.add(sums.get(index));
        result.add(firstNumbers.get(index));
        result.add(secondNumbers.get(index));
        return result;
    }

    public static void main(String[] args) {
     int [] tab = {3,-4,6,1,2};

        System.out.println(solution(tab));
    }
}
