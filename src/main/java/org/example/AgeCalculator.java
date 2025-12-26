package org.example;

public class AgeCalculator {
    public static String ageUntil100(int currentAge) {

        if (currentAge > 100) {
            return "What are you, some kind of vampire?";
        } else if (currentAge == 100) {
            return "Congrats, you are 100 years old!";
        } else if (currentAge == 99) {
            return "You are 1 year away from being 100 years old!";
        } else if (currentAge > 0) {
            int yearsLeft = 100 - currentAge;
            return "You are " + yearsLeft + " years away from being 100 years old!";
        } else {
            return "I guess we'll never know :/";
        }
    }

}

