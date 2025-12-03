package Basics;

public class Strings {
    public static void main(String[] args) {
        // string methods

        String name = "shashanth";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("h");
        int lastindex = name.lastIndexOf("t");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("a", "0");

        boolean yes = name.equals("shashanth");
        boolean ignore = name.equalsIgnoreCase("shashanth");
        boolean no = name.isEmpty();



    }
}
