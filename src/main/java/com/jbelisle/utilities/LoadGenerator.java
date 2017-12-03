package com.jbelisle.utilities;

import java.math.BigInteger;

public class LoadGenerator {
    public LoadGenerator() {
    }

    public String doWork(int iterations) {
        BigInteger factValue = BigInteger.ONE;
        long t1 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            factValue = factValue.multiply(BigInteger.valueOf(i));
        }
        long t2 = System.nanoTime();

        String milliseconds = ((double) (t2 - t1) / 1000000) + " ms";
        return milliseconds;
    }
}