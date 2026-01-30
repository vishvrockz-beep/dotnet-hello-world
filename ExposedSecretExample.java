package com.example;

/*
 WARNING: This file intentionally contains several TEST/DUMMY tokens
 for the sole purpose of exercising secret scanning. THESE ARE
 NON-FUNCTIONAL EXAMPLES — do NOT use these values in production.
*/
public class ExposedSecretExample {
    // AWS-like example (Access Key ID pattern + Secret Access Key pattern)
    // TEST ONLY
    private static final String AWS_ACCESS_KEY_ID = "AKIAAAAAAAAAAAAAAAA";
    // TEST ONLY (example from AWS docs)
    private static final String AWS_SECRET_ACCESS_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

    // GitHub token-like pattern (TEST ONLY)
    private static final String GITHUB_TOKEN = "ghp_TESTTOKEN012345678901234567890";

    // Slack bot token-like pattern (TEST ONLY)
    private static final String SLACK_TOKEN = "xoxb-TEST-123456789012-ABCDEF";

    public static void main(String[] args) {
        System.out.println("TEST tokens (do NOT use in production):");
        System.out.println("AWS_ACCESS_KEY_ID: " + AWS_ACCESS_KEY_ID);
        System.out.println("AWS_SECRET_ACCESS_KEY: " + AWS_SECRET_ACCESS_KEY);
        System.out.println("GITHUB_TOKEN: " + GITHUB_TOKEN);
        System.out.println("SLACK_TOKEN: " + SLACK_TOKEN);
    }
}
