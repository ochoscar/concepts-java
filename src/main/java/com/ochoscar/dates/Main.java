package com.ochoscar.dates;

import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(1970 + time / (1000 * 60 * 60 * 24 * 365.25));
        System.out.println(Long.MAX_VALUE / (1000 * 60 * 60 * 24 * 365.25));
    }

}
