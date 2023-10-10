package com.hexa_converter;

import java.util.ArrayList;
import java.util.List;

public class Base10ToBinaryConverter {
    private String binaryResult;
    private String onesComplement;

    public Base10ToBinaryConverter(long number) {
        convertToBinary(number);
    }

    private void convertToBinary(long number) {
        if (number < 0) {
            number = (number + 1) * -1;
            convertToBinary(number);
            binaryResult = getOnesComplement();
            return;
        }
        List<Long> result = new ArrayList<>();

        while (number != 0) {
            result.add(number % 2);
            number = number / 2;
        }

        binaryResult = binaryToString(result);
    }

    private String binaryToString(List<Long> result) {
        StringBuilder sb = new StringBuilder();

        if (result == null || result.isEmpty()) {

            return outputFormatter(sb, 0);
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            sb.append(result.get(i));
        }

        return outputFormatter(sb, result.size() - 1);
    }

    public String getBinaryResult() {
        return binaryResult;
    }

    private String outputFormatter(StringBuilder sb, int size) {
        StringBuilder builder = new StringBuilder(Long.SIZE);

        for (int i = 0; i < Long.SIZE; i++) {
            builder.append("0");

        }

        if (size == 0) {
            return builder.toString();
        }

        builder.append(sb.toString());

        builder.delete(0, size);

        return builder.toString();

    }

    public String getOnesComplement() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < binaryResult.length(); i++) {
            switch (binaryResult.charAt(i)) {
                case '0':
                    sb.append("1");
                    break;
                case '1':
                    sb.append("0");
                    break;

                default:
                    break;
            }
        }

        onesComplement = sb.toString();
        return onesComplement;

    }

}
