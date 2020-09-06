package codeSignal;

public class CheckPalindrome {

    // https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ/solutions?solutionId=fhtkZ5hWn2LB7cNyj
   static boolean checkPalindrome(String inputString) {
        StringBuilder input1 = new StringBuilder();
        input1.append(inputString);

        input1.reverse();
       String input2 =  input1.toString();

       System.out.println(input1);
       System.out.println(inputString);

       if (inputString.equals(input2))
           return true;
       else

        return false;
    }

    // boolean checkPalindrome(String inputString) {
    //    return inputString.equals(new StringBuilder(inputString).reverse().toString());
    //}

    public static void main(String[] args) {
        String inputString = "aabaak";
        checkPalindrome(inputString);
        System.out.println(checkPalindrome(inputString));
    }

}
