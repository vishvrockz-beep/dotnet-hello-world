package com.example;

/*
 WARNING: This file intentionally contains an exposed secret for testing secret scanning.
 DO NOT use this value in production. It's a dummy value: never commit real credentials.
*/
public class ExposedSecretExample {
    // Fake secret for testing only
    private static final String API_KEY = "TEST_SECRET_1234567890_DO_NOT_USE";

    public static void main(String[] args) {
        // Simulate using the secret (this will expose it in logs/output)
        System.out.println("Using API key: " + API_KEY);
        // In real code, you would call your API client here using API_KEY
    }
}
