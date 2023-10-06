package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        for (long i = 0; i < 3000; i++) {
            // long i = 512l;
            Base10ToHexConverter hexaConverter = new Base10ToHexConverter(i);
            System.out.println("decimal " + i + " = " + hexaConverter.getConvertedNumber() + " hexadecimal");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

}