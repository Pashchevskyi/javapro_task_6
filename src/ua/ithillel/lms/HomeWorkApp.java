package ua.ithillel.lms;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println("Sum is from 10 to 20: " + isSumFrom10To20(-5, 5));
        checkValueForPositivity(-2);
        System.out.println("Number is negative: " + isNegative(2));
        repeatString("Слава Україні!", 2);
        System.out.println("Leap year: " + isYearLeap(1995));
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = -2, b = -4;
        if ((a + b) >= 0) {
            System.out.println("Сума додатна");
        } else {
            System.out.println("Сума від'ємна");
        }
    }

    private static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Червоний");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        }
        if (value > 100) {
            System.out.println("Зелений");
        }
    }

    private static void compareNumbers() {
        int a = -5, b = -4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static boolean isSumFrom10To20(int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <= 20);
    }

    private static void checkValueForPositivity(int value) {
        if (value >= 0) {
            System.out.println("Передане значення додатне");
        } else {
            System.out.println("Передане значення від'ємне");
        }
    }

    private static boolean isNegative(int value) {
        return (value < 0);
    }

    private static void repeatString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    private static boolean isYearLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
