package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        }
        else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        }
        else if (lang.equals("it")) {
            return "Ciao, Mondo!";
        }
        else if (lang.equals("ch")) {
            return "Nǐ hǎo shìjiè!";
        }
        else return "Hello, World!";
        /*
        return switch (lang) {
            case "sp" -> "¡Hola, Mundo!";
            case "fr" -> "Bonjour, le monde!";
            case "it" -> "Ciao, Mondo!";
            case "ch" -> "Nǐ hǎo shìjiè!";
            default -> "Hello, World!";
        };
        */
    }
}