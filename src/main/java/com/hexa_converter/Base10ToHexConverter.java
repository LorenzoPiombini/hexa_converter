package com.hexa_converter;

import java.util.ArrayList;
import java.util.List;

public class Base10ToHexConverter {

    private String convertedNumber;

    public Base10ToHexConverter(long number) {
        if (number <= 0) {
            this.convertedNumber = "I can`t convert negative number or 0";
        } else {
            this.convertedNumber = convertNumberInHexaLetters(getHexaValue(number));
        }

    }

    public List<Long> getHexaValue(long numberToConvert) {

        List<Long> hexavalues = new ArrayList<>();

        if (numberToConvert < 16) {
            hexavalues.add(numberToConvert);
            return hexavalues;
        }

        while (numberToConvert != 0) {
            hexavalues.add(numberToConvert % 16);
            numberToConvert = numberToConvert / 16;
        }

        return hexavalues;
    }

    public static String convertNumberInHexaLetters(List<Long> hexaValues) {

        StringBuilder sb = new StringBuilder();

        for (int i = hexaValues.size() - 1; i >= 0; i--) {

            long h = hexaValues.get(i);

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
