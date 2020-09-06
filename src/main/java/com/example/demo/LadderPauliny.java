package com.example.demo;

public class LadderPauliny {
    public static int[] solution(int[] A, int[] B) {
        int length = A.length;
        int counter;
        int[] result = new int[length];
        for (int i = 0; i < A.length; i++) {
            int j = A[i];
            counter = 1;
            if (A[i] % 2 == 0) {
                do {
                    j--;
                    counter = counter + (j);
                    j--;
                } while (j >= A[i] / 2);
            } else {
                do {
                    j--;
                    counter = counter + (j);
                    if (j != 0) {
                        j--;
                        if (j <= A[i] / 2) {
                            counter = counter + 1;
                            break;
                        }
                    }
                } while (j > A[i] / 2);
            }
            result[i] = (int) (counter % Math.pow(2, B[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A =  {4,4,5,5,1};
        int[] B = {3,2,4,3,1};

        solution(A,B);
    }
}
