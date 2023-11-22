package com.mycompany.app;

import sun.misc.BASE64Encoder;

public class App {

    public static int add(int a, int b){
        return a + b;
    }
    public static String Encode()
    {
        String originalString = "Hello, World!";
        byte[] bytesToEncode = originalString.getBytes();
        BASE64Encoder encoder = new BASE64Encoder();
        String encodedString = encoder.encode(bytesToEncode);

        System.out.println("Encoded: " + encodedString);
        return encodedString;
    }
}