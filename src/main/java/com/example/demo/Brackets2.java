package com.example.demo;

import java.util.Stack;
//Pauliny
public class Brackets2 {
    public static int solution(String S) {
        Stack<Character> leftBracket = new Stack<>();
        char top=0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '}' || S.charAt(i) == ')' || S.charAt(i) == ']') {
                if (leftBracket.empty()) {
                    return 0;
                } else if (!leftBracket.empty()) top = leftBracket.peek();
                if ( top == '(' & S.charAt(i) == ')'
                        || top == '[' & S.charAt(i) == ']'
                        || top == '{' & S.charAt(i) == '}') {
                    leftBracket.pop();
                }
            } else {
                leftBracket.push(S.charAt(i));
            }
        }
        if (leftBracket.empty()) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        String S = "{[()()]}";
        System.out.println(solution(S));
    }
}