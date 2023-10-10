package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        long n = 1;

        Base10ToBinaryConverter converter = new Base10ToBinaryConverter(n);
        System.out.println(n + " -->  " + converter.getBinaryResult());
        // System.out.println(~n + " --> " + converter.getOnesComplement());

    }

}