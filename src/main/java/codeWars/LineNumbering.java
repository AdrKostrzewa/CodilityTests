package codeWars;

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        // TODO


        for (int i = 0; i <lines.size() ; i ++){
           lines.set(i,(i + 1) + ": " + lines.get(i)) ;
        }

        System.out.println(lines);
        return lines;
    }

    public static void main(String[] args) {
        List <String> lista = new LinkedList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");



        number(lista);
    }
}
