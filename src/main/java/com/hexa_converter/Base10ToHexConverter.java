package com.hexa_converter;

import java.util.ArrayList;
import java.util.List;

public class Base10ToHexConverter {
    private long powIndex = 0l;
    private long result = 0l;
    private String convertedNumber;

    public Base10ToHexConverter(long number) {
        if (number <= 0) {
            this.convertedNumber = "I can`t convert negative number or 0";
        } else {
            this.convertedNumber = convertNumberInHexaLetters(getHexaValue(number));
        }

    }

    public long largestPowerOf16(long number) {

        for (int i = 0; i < number; i++) {
            if (((long) Math.pow((double) 16, (double) i)) > number) {
                return result;
            }
            result = (long) Math.pow((double) 16, (double) i);
            powIndex = (long) i;
        }

        return result;
    }

    public static long getRemmainder(long number, long largestPowerOf16) {
        return number % largestPowerOf16;
    }

    public List<Long> getHexaValue(long numberToConvert) {

        List<Long> hexavalues = new ArrayList<>();

        if (numberToConvert < 16) {
            hexavalues.add(numberToConvert);
            return hexavalues;
        }

        while (numberToConvert != 0) {
            long hexaValue = numberToConvert / largestPowerOf16(numberToConvert);
            hexavalues.add(hexaValue);
            numberToConvert = getRemmainder(numberToConvert, largestPowerOf16(numberToConvert));
        }

        return hexavalues;
    }

    public static String convertNumberInHexaLetters(List<Long> hexaValues) {
        StringBuilder sb = new StringBuilder();

        for (Long h : hexaValues) {

            switch (Long.toString(h)) {
                case "10":
                    sb.append("A");
                    break;
                case "11":
                    sb.append("B");
                    break;
                case "12":
                    sb.append("C");
                    break;
                case "13":
                    sb.append("D");
                    break;
                case "14":
                    sb.append("E");
                    break;
                case "15":
                    sb.append("F");
                    break;

                default:
                    sb.append(h);
                    break;
            }
        }

        return sb.toString();
    }

    public String getConvertedNumber() {
        return convertedNumber;
    }

}
