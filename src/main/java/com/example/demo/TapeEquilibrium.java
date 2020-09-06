package com.example.demo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i : A){
            listA.add(Integer.valueOf(i));
        }
        for (int i : listA){
            listB.add(i);
        }

        Collections.reverse(listB);

        int temp = 0;
        for (int i = 0; i <listA.size()-1; i ++){
            temp = temp + listA.get(i);

            for(int y = listB.size()-1; y > 0; y--){
                int sumB = listB.stream().mapToInt(Integer::intValue).sum();
                sumB = sumB - listB.get(y);
                listB.remove(listB.size()-1);
                result.add(Math.abs(temp - sumB));
                break;
            }
        }
        return Integer.valueOf(Collections.min(result));
    }

    public static void main(String[] args) {
//        int[] A = {5,3,2,4,2};
        int[] A = {3,1,2,4,3};
        List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();
            List<Integer> result = new ArrayList<>();
            for (int i : A){
                listA.add(Integer.valueOf(i));
            }
            for (int i : listA){
                listB.add(i);
            }

            Collections.reverse(listB);

            int temp = 0;
            for (int i = 0; i <listA.size()-1; i ++){
                temp = temp + listA.get(i);

                for(int y = listB.size()-1; y > 0; y--){
                    //mapowanie na int z Integerów
                    int sumB = listB.stream().mapToInt(Integer::intValue).sum();
                    
                    sumB = sumB - listB.get(y);
                    listB.remove(listB.size()-1);
                    result.add(Math.abs(temp - sumB));
                    break;
                }
        }

        System.out.println(listA);
        System.out.println(listB);
        System.out.println(result);


        System.out.println(solution(A));

    }
}
