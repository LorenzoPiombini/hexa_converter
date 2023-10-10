package com.hexa_converter;

import java.util.ArrayList;
import java.util.List;

public class Base10ToHexConverter {

    private String convertedNumber;

    public Base10ToHexConverter(long number) {
        if (number <= 0) {
            this.convertedNumber = getHexaValueForNegativeNumber(number);
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

    public String getHexaValueForNegativeNumber(long numbertoConvert) {
        List<String> resultOutput = new ArrayList<>();
        String bits = "";

        StringBuilder sb = new StringBuilder();
        Base10ToBinaryConverter converter = new Base10ToBinaryConverter(numbertoConvert);

        for (int i = 0; i < converter.getBinaryResult().length(); i++) {
            if ((bits = sb.toString()).length() == 4) {
                bits = sb.toString();
                resultOutput.add(convertNumberInHexa(binaryToDecimal(bits)));
                sb.delete(0, bits.length());
                sb.append(converter.getBinaryResult().charAt(i));
            } else {
                sb.append(converter.getBinaryResult().charAt(i));
            }

        }

        return negativeHexaOutputFormatter(resultOutput);
    }

    private long binaryToDecimal(String bitsToConvert) {
        long result = 0l;
        int power = 0;

        for (int i = bitsToConvert.length() - 1; i >= 0; i--) {
            int bitValue = Integer.parseInt(String.valueOf(bitsToConvert.charAt(i)));
            if (bitValue == 1) {
                result += (long) Math.pow(2, power);
            }
            power++;
        }

        return result;
    }

    private String negativeHexaOutputFormatter(List<String> result) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
        }

        return sb.toString();
    }

    private String convertNumberInHexa(long number) {

        StringBuilder sb = new StringBuilder();

        switch (Long.toString(number)) {
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
                sb.append(number);
                break;
        }

        return sb.toString();
    }
}
