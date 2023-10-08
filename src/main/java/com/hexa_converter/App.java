package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        for (long i = 0; i < 100000000; i++) {

            Base10ToHexConverter hexaConverter = new Base10ToHexConverter(i);
            System.out.println("decimal " + i + " = " + hexaConverter.getConvertedNumber() + " hexadecimal");

        }
    }

}