package strings;

import oop.Car;

public class StringIntro {
    public static void main(String[] args) {
        //Assignment what is the difference between isBlank and isEmpty method in string
        //Assignment what is the difference betweeen trim and strip in java strings
        String sentence = "I love Java ";

        Car car = new Car();



        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.length());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.concat(". Java is nice"));
        System.out.println(sentence.replace('a', 'o'));
        System.out.println(sentence.indexOf("I"));
        System.out.println(sentence.replaceAll("love", "hate"));
        System.out.println();
    }
}
