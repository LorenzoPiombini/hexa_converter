package com.hexa_converter;

import java.util.ArrayList;
import java.util.List;

public class Base10ToBinaryConverter {
    private String binaryResult;

    public Base10ToBinaryConverter(long number) {
        convertToBinary(number);
    }

    private void convertToBinary(long number) {
        if (number == 0)
            binaryResult = "0000";

        List<Long> result = new ArrayList<>();

        while (number != 0) {
            result.add(number % 2);
            number = number / 2;
        }

        binaryResult = binaryToString(result);
    }

    private String binaryToString(List<Long> result) {
        StringBuilder sb = new StringBuilder();
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

        builder.replace(0, size, sb.toString());

        return builder.reverse().toString();

    }
}
