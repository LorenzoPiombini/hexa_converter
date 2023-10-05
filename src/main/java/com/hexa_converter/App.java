package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Base10ToHexConverter hexaConverter = new Base10ToHexConverter(109);
        System.out.println(hexaConverter.getConvertedNumber());

    }

}