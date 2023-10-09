package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Base10ToBinaryConverter converter = new Base10ToBinaryConverter(10);
        System.out.println(converter.getBinaryResult());

    }

}