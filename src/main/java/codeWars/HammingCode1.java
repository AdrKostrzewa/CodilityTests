package codeWars;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e/java
public class HammingCode1 {

        public static String encode(String text) {
            String bits = "";
            int ascii;

            char [] ch = text.toCharArray();
            int [] intArray = new int [ch.length];


            for (int i = 0; i< ch.length; i++){
                ascii = (int) ch[i];
                intArray[i]= ch[i];
            }
            String bit ="";
            String stringBit = "";
            for (int y : intArray){
                if (Integer.toBinaryString(y).length() <7)
                    bit = "00" + Integer.toBinaryString(y);
                    else
                bit = "0" + Integer.toBinaryString(y);
//                bit =  Integer.toBinaryString(y);
                stringBit = stringBit  + " " +bit;

            }

//            System.out.println(Arrays.toString(intArray));
            System.out.println(stringBit);
//            Integer.toBinaryString()
            char [] chBit = stringBit.toCharArray();

            String chBitToString = "";
            for ( char element : chBit){
                if (element == '0' ){
                    chBitToString = chBitToString + ("000" );
                }else if(element == '1'){
                    chBitToString = chBitToString + ("111" );
                }
            }

            System.out.println("wynik " + chBitToString);
            return chBitToString;
        }



        public static String decode(String bits) {
            String text = "";
            List<String> stringThree = new LinkedList<>();
            List<String> stringEight = new LinkedList<>();

            //dziele na 3cyfrowe ciągi
            for (int i =0; i< bits.length() + 1; i++){
                if (i % 3 ==0 && i != 0){
                    stringThree.add(bits.substring(i -3, i)) ;
                    System.out.println(bits.substring(i -3, i));  ;
                }
            }
            System.out.println(stringThree);


            String wynik = "";


            //tutaj całe to szyfrowanie
            for (String element : stringThree){
                if (element.equals("000")){
                    wynik = wynik + "0";
                }
                    else if(element.equals("111")) {
                    wynik = wynik + "1";
                    }else {
                        int sprawdzacz = 0;
                        for (int y =0; y<element.length(); y++) {
                            if (element.charAt(y) == '0') {
                                sprawdzacz = sprawdzacz + 1;
                            }
                        }
                            if (sprawdzacz > 1){
                                wynik = wynik + "0";
                            }else {
                                wynik = wynik + "1";
                            }
                         }
            }


            //dziele string na 8smio literowe stringi
            for (int i =0; i< wynik.length() + 1 ; i++){
                if (i % 8 ==0 && i != 0){
                    stringEight.add(wynik.substring(i -8, i)) ;

                }
            }
            System.out.println(stringEight);

            // konwertuje binary na ascii
            String result = "";
            for (String element : stringEight){
                int num = Integer.parseInt(element,2);
                System.out.println(num);
                result = result + Character.toString((char) num);
            }




            System.out.println(result);

            return result;
        }

    public static void main(String[] args) {
       // encode("T3st");
      //  System.out.println("wynik2" + "0001110001110001110000000001111110001110000000000001111110000001110001110000001110000000000000000001110001110000001111110001111110000001110001110001111110001111111110000001111111110000001111110001111110000001110001110001111110001110000001110000001110000000000000000001111111110001110000000001111110001111111111110001111110001111110000000001111110000001110000000000001110000000000000000001111110001111110");
       //System.out.println("wynik2" + "000111111000111000000000000111111000000111000111000111111111111000000111");
   //   System.out.println("wynik3" + "000111000111000111000000000000111111000000111111000111111111000000111111000111111111000111000000");
       decode("100111111000111001000010000111111000000111001111000111110110111000010111");
        }
    }

