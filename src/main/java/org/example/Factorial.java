package org.example;

public class Factorial {
    public int getfactorial(int num){
        int fact =1;
        for(int i =1;i<=num;i++ ){
            fact*=i;
        }
        return  fact;
    }
}
