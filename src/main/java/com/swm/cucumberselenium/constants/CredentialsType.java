package com.swm.cucumberselenium.constants;

public enum CredentialsType {

    VALID(new String[] { "valid", "correct" }),
    INVALID_USERNAME(new String[] { "invalid_username" }),
    INVALID_PASSWORD(new String[] { "invalid_password" });


    private String[] aliases;

    CredentialsType(String[] aliases) {
        this.aliases = aliases;
    }

    public static CredentialsType credentialsTypeForName(String credentialsType)
            throws IllegalArgumentException {
        for (CredentialsType ct : values()) {
            for (String alias : ct.aliases) {
                if (alias.equalsIgnoreCase(credentialsType)) {
                    return ct;
                }
            }
        }
        throw credentialsTypeNotFound(credentialsType);
    }

    private static IllegalArgumentException credentialsTypeNotFound(String ct) {
        return new IllegalArgumentException(("Invalid credentials type [" + ct + "]"));
    }

}
