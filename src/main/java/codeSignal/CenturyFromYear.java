package codeSignal;
// https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
public class CenturyFromYear
{
   int  centuryFromYear(int year) {
       int result = 0;
        if (year % 100 == 0){
          result =  year / 100 - 1 ;
        }else {
            result = year / 100;
        }
return result;
    }

    public static void main(String[] args) {
        int year = 1900;
        int result = year / 100;
        System.out.println(result);
    }
}
