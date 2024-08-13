package validating;

public class Calculator {

    public int factorial(int num) {
        int answer = 1;
        if(num >= 0){
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }
        } else {
            throw new IllegalArgumentException("the method argument should be a positive number");
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if(setSize < 0 || subsetSize < 0 || subsetSize > setSize){
            throw new IllegalArgumentException("the method argument should be a positive number");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
