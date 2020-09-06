package codeSignal;
// https://app.codesignal.com/interview-practice/task/uX5iLwhc6L5ckSyNC/solutions
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter{

  static   char firstNotRepeatingCharacter(String s) {
        Map<Character, Integer> mapa = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int value = 1;
            if (!mapa.containsKey(s.charAt(i))) {
                mapa.put(s.charAt(i), value);

            } else {
                mapa.replace(s.charAt(i), value + 1);
            }
        }

      for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
          if (entry.getValue()%2==1){
              return entry.getKey();
          }
      }

      System.out.println(mapa);

        return '_';
    }


//    static char firstNotRepeatingCharacter2(String s) {
//        char[] c=s.toCharArray();
//        for(int i=0;i<s.length();i++){
//            if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
//                return c[i];
//        }
//        return '_';
//    }


    public static void main(String[] args) {
        String s = "abacabad";
        System.out.println(firstNotRepeatingCharacter(s));

    }
}


