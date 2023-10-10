package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        long n = -67;

        Base10ToHexConverter c = new Base10ToHexConverter(n);
        System.out.println(n + " --> " + c.getConvertedNumber());

        Base10ToBinaryConverter converter = new Base10ToBinaryConverter(n);
        System.out.println(n + " -->  " + converter.getBinaryResult());
        // System.out.println(~n + " --> " + converter.getOnesComplement());

    }

}