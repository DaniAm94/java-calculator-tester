package org.calculator;

public abstract class Calculator {


    public static float add(float num1, float num2){
        return num1 + num2;
    }

    public static float subtract(float num1, float num2){
        return num1 - num2;
    }

    public static float multiply(float num1, float num2){
        float result= num1 * num2;
        if(result == -0.0){
            return 0.0f;
        } else return result;
    }

    public static float divide(float num1, float num2){
        float result= num1 / num2;
        if(result == -0.0){
            return 0.0f;
        } else return result;
    }

}
