package com.hexa_converter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long n = -5059009787676788988L;
        simultaneousThread(n);
        // sequetial(n);
        long end = System.currentTimeMillis();
        System.out.println("time :" + (end - start));

    }

    public static void simultaneousThread(long n) {
        ConversionExecution execution = new ConversionExecution(n);

        System.out.println("the number " + n + " in hexa:" + execution.getHexa() + "\nthe same number in binary is: "
                + execution.getBinary() + ".");

    }

    public static void sequetial(long n) {
        Base10ToBinaryConverter b = new Base10ToBinaryConverter(n);
        Base10ToHexConverter h = new Base10ToHexConverter(n);

        System.out.println("the number " + n + " in hexa:" + h.getConvertedNumber() + "\nthe same number in binary is: "
                + b.getBinaryResult() + ".");
    }

}