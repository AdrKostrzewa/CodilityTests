package codeSignal;
// https://app.codesignal.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m/solutions?solutionId=THb4nqRaiWigjhyN5
public class AdjacentElementsProduct {

    static int adjacentElementsProduct(int[] inputArray) {
        int max = -1001;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int result = inputArray[i] * inputArray[i + 1];
            if (result > max) {
                max = result;
            }
        }

        return max;
    }

    public static void main(String[] args) {
       int [] inputArray = {-23, 4, -3, 8, -12};
        adjacentElementsProduct(inputArray);
    }
}
