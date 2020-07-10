package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermMissingElem {

     public   int solution(int[] A){
         int result = 0;
         if (A.length == 1 || A.length ==0){
             result = 1;
         }else {
             List targetList = new ArrayList();
             for (int i = 0; i < A.length; i++) {
                 targetList.add(A[i]);
             }

             Collections.sort(targetList);

             for (int y = 0; y < targetList.size(); y++) {
                 if ((Integer) targetList.get(y) == ((Integer) targetList.get(y + 1) - 1)) {
                     continue;
                 } else {
                     targetList.add((Integer) targetList.get(y) + 1);
                     result = (Integer) targetList.get(y) + 1;
                     break;
                 }
             }

             Collections.sort(targetList);
         }


         return result;
    }

    public static void main(String[] args) {

         int [] A  = {1,3};
         int result =0;
        List targetList = new ArrayList();
         for (int i = 0; i<A.length ; i++){
        targetList.add(A[i]);
         }

        Collections.sort(targetList);

//         for(int y= 0; y < targetList.size(); y ++){
//             if ((Integer) targetList.get(y) == ((Integer) targetList.get(y+1) -1 )){
//                 continue;
//             }else {
//                 targetList.add((Integer) targetList.get(y)+1 );
//                result = (Integer) targetList.get(y)+1;
//                 break;
//             }
//         }

         Collections.sort(targetList);

//        System.out.println(result);
//        System.out.println(targetList);
//        System.out.println(A.length);






    }
}
