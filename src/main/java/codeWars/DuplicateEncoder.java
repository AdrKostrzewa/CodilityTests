package codeWars;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Map;

//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java
public class DuplicateEncoder {

        static String encode(String word){
            Map<Character, Integer> mapa = new HashMap<>();
            List<Character> chars = new ArrayList<>();
            word = word.toLowerCase();



            for (char ch : word.toCharArray()){
                chars.add(ch);
            }

            for (char element : chars) {
                if (mapa.containsKey(element)) {
                    mapa.replace(element, mapa.get(element) + 1);
                } else {
                    mapa.put(element, 1);
                }
            }

                for ( int i =0; i < chars.size(); i++){
                    if (mapa.get(chars.get(i)) > 1 ){
                        chars.set(i, ')');
                    }else{
                        chars.set(i, '(');
                    }
                }

                StringBuilder sb = new StringBuilder();
                for (char ch : chars){
                    sb.append(ch);
                }


            word = sb.toString();
            System.out.println(chars);
            System.out.println(word);

            return word;
        }

    public static void main(String[] args) {
        encode("Prespecialized");
    }
//")()())()(()()(",
    }

