package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        return switch (lang) {
            case "sp" -> "¡Hola, Mundo!";
            case "fr" -> "Bonjour, le monde!";
            case "it" -> "Ciao, Mondo!";
            case "ch" -> "Nǐ hǎo shìjiè!";
            default -> "Hello, World!";
        };
    }
}