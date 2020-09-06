package com.example.demo;

public class FrogJmp {


    public  int solution(int X, int Y, int D) {
            int G = ((Y-X)/D);
            int result = 0;

            if ((Y-X)%D==0){
                result = G;
            }else{
                result= G+1;
            }
            return result;
    }

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        int G = ((Y-X)/D);
        int result = 0;

        if ((Y-X)%D==0){
            result = G;
        }else{
            result= G+1;
        }


    }
}
