package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        long n = -5059;

        ConversionExecution execution = new ConversionExecution(n);

        System.out.println("the number " + n + " in hexa:" + execution.getHexa() + "\nthe same number in binary is: "
                + execution.getBinary() + ".");

    }

}