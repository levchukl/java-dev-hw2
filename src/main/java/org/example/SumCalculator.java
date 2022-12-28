package org.example;

public class SumCalculator {
    public int sum (int n){
        if (n<1) {
            throw new IllegalArgumentException();
        }
        int result = 0;
        int i = 0;
        while (i <= n) {
            result += i;
            i++;
        }
        return result;
    }
}
