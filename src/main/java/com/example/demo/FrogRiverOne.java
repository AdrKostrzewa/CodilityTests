package com.example.demo;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrogRiverOne {


    public static int solution(int X, int[] A){
        int result = 0;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        for (int i :A){
            listA.add(Integer.valueOf(i));
        }


        for (int i = 1; i< X+1; i++){
            listB.add(i);
        }

        for ( int i = 0; i <= listA.size()-1; i++){
            listC.add(listA.get(i));
            if(listC.containsAll(listB)){
                result = listC.size()-1;
                break;
            }else result = -1;


        }

        return result;
    }

    public static void main(String[] args) {
        int [] A = {1,2,3,5,1,3,4,2};
//        int [] A = {1,1,1,1,1,1,1,1};
        int X = 5;
        int result = 0;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        for (int i :A){
            listA.add(Integer.valueOf(i));
        }


        for (int i = 1; i< X+1; i++){
            listB.add(i);
        }

        for ( int i = 0; i <= listA.size()-1; i++){
            listC.add(listA.get(i));
            if(listC.containsAll(listB)){
                result = listC.size()-1;
                break;

            }else result = -1;
        }

        System.out.println(result);

        System.out.println(solution(X, A));
    }



}
