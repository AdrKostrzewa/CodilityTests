package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//frogs
public class SolutionSollersZaby {
    public static int solution(int[] blocks) {
        int countRise = 0;
        int countDecrease = 0;
        List<Integer> distances = new ArrayList<>();
        int distance = 0;
        int i = 0;
        do {
            if (blocks[i] <= blocks[i + 1]) {
                do {
                    countRise++;
                    i++;
                } while (blocks[i] <= blocks[i + 1]);
            } else {
                do {
                    countDecrease++;
                    i++;
                    if (i == blocks.length - 1) break;
                } while (blocks[i] >= blocks[i + 1]);
                if (i != blocks.length - 1) {
                    while (blocks[i] <= blocks[i + 1]) {
                        countRise++;
                        i++;
                        if (i == blocks.length - 1) break;
                    }
                }
                countRise = countRise + countDecrease;
            }
            distances.add(countRise);
            countRise = 0;
        } while (i != blocks.length - 1);
        distance = Collections.max(distances) + 1;
        return distance;
    }

    public static void main(String[] args) {
        int [] tab  = {6,10,9,7,5};
        System.out.println(solution(tab));

    }


}
