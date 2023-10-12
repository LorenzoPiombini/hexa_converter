package com.hexa_converter;

public class ConversionExecution {
    private Base10ToBinaryConverter binaryConverter;
    private Base10ToHexConverter hexaConverter;
    private Thread t1;
    private Thread t2;

    public ConversionExecution(long number) {
        this.t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                binaryConverter = new Base10ToBinaryConverter(number);
            }

        });

        this.t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                hexaConverter = new Base10ToHexConverter(number);
            }

        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(10); // this alow the threads to finish so we can use the result form the computation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getHexa() {
        return hexaConverter.getConvertedNumber();
    }

    public String getBinary() {
        return binaryConverter.getBinaryResult();
    }

}
