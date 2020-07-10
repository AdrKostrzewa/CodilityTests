package com.example.demo;



import java.util.Arrays;


public class CodilityArray {

    public  static int[] solution(int[] A, int K) {

        for (int s = K; s >0; s--) {
            int temp = A[A.length -1];
            for (int i = A.length-1; i > 0; i--) {

                A[i] = A[i - 1];
            }
            A[0] = temp;

        }
        return A;
    }



    public static void main(String[] args) {
        int [] tab = {15,17,10,5,3};

        System.out.println(Arrays.toString(solution(tab, 3)));


    }
}





