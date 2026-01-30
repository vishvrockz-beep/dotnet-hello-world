package com.example;

/*
 Remediated example: read secret from environment variable and mask it in logs.
 This is the recommended pattern: never hard-code secrets in source.
*/
public class RemediatedExample {
    private static final String API_KEY = System.getenv("API_KEY");

    public static void main(String[] args) {
        if (API_KEY == null || API_KEY.isEmpty()) {
            System.err.println("API_KEY not set. Please set environment variable.");
            System.exit(1);
        }
        System.out.println("API key loaded from environment (masked): " + mask(API_KEY));
        // Use the API_KEY with your client without printing the raw value.
    }

    private static String mask(String s) {
        if (s == null) return null;
        int len = s.length();
        if (len <= 8) return "********";
        return s.substring(0, 4) + "****" + s.substring(len - 4);
    }
}
