package com.eviltester.webdriver;

public class task {
    public static void main(String[] args) {
        mainb();
        maina();
        mainc();
    }

    public static void mainb() {
        String original = "alex";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    public static void maina() {
        String original = "alex";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }

    public static void mainc() {
        String original = "alex";
        char[] charArray = original.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        System.out.println("Reversed string: " + reversed);
    }

}
