package week1;

import java.util.Scanner;

public class FirstLesson {

    private static final double MILES_RATIO = 1.609344;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        boolean shouldContinue = true;
        System.out.println("Hello, fellow human!");
        while(shouldContinue) {
            System.out.println("Please select the task you want to perform or press 0 to exit : ");
            System.out.println("1 - Run Miles/KM Converter");
            System.out.println("2 - Run Oddity checker");
            System.out.println("3 - Run Cubic checker");
            System.out.println("4 - Run Magic number");
            System.out.println("5 - Run Palindrome number");
            System.out.println("0 - Exit");
            int selectedMode = scanner.nextInt();
            if (selectedMode == 1) {
                RunFirstTask();
            } else if (selectedMode == 2) {
                RunSecondTask();
            } else if (selectedMode == 3) {
                RunThirdTask();
            } else if (selectedMode == 4) {
                RunFourthTask();
            } else if (selectedMode == 5) {
                RunFifthTask();
            } else if (selectedMode == 0) {
                shouldContinue = false;
            }
        }

        scanner.close();
    }
    //region FirstTask
    private static void RunFirstTask() {
        double convertedValue;
        System.out.println("Please, select converter mode:");
        System.out.println("1 - Convert Miles to Kilometers");
        System.out.println("2 - Convert Kilometers to Miles");
        int selectedMode = scanner.nextInt();
        System.out.print("Please, enter your value to convert: ");
        double userInputToConvert = scanner.nextDouble();
        if (selectedMode == 1) {
            convertedValue = ConvertMilesToKm(userInputToConvert);
        } else if(selectedMode == 2) {
            convertedValue = ConvertKmToMiles(userInputToConvert);
        } else {
            convertedValue = 0.0;
        }
        System.out.println("converted value is " + convertedValue);
    }

    private static double ConvertMilesToKm(double miles) {
        double retVal;
        retVal = miles * MILES_RATIO;
        return retVal;
    }

    private static double ConvertKmToMiles(double km) {
        double retVal;
        retVal = km / MILES_RATIO;
        return retVal;
    }
    //endregion
    //region SecondTask
    private static void RunSecondTask() {
        System.out.print("Please, enter your number to check oddity: ");
        int userInput = scanner.nextInt();
        String oddityAnswer;
        if (userInput % 2 == 0) {
            //even
            oddityAnswer = "even";
        } else {
            //odd
            oddityAnswer = "odd";
        }
        System.out.println("Your number is " + oddityAnswer);
    }
    //endregion
    //region ThirdTask
    private static void RunThirdTask() {
        System.out.print("Please, enter your number to check if it's cubic number: ");
        int userInput = scanner.nextInt();
        double cubicNum = Math.cbrt(userInput * 1.0);
        boolean isCubic =  cubicNum == Math.floor(cubicNum) && Double.isFinite(cubicNum);
        System.out.println("Your number is " + (isCubic ? "cubic" : "non-cubic"));
    }
    //endregion
    //region FourthTask
    private static void RunFourthTask() {
        System.out.print("Please, enter your number to check if it's magic number: ");
        int userInput = scanner.nextInt();
        boolean isMagic;
        isMagic = IntDigitSum(userInput) == 1;
        System.out.println("Your number is " + (isMagic ? "magic" : "non-magic"));
    }
    //endregion
    //region FifthTask
    private static void RunFifthTask() {
        System.out.print("Please, enter your number to check if it's palindrome number: ");
        String userInput = scanner.next();
        char[] charArray = userInput.toCharArray();
        int oddNumberShift = charArray.length % 2;
        boolean isPalindrome = false;
        for (int i = 0; i < charArray.length - oddNumberShift / 2; i++) {
            if (charArray[i] == charArray[charArray.length - 1 - i]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Your number is " + (isPalindrome ? "palindrome" : "non-palindrome"));
    }

    private static int IntDigitSum(int userInput) {
        int sum = 0;
        int tmp = userInput;
        while (tmp > 0 ) {
            sum = sum + tmp % 10;
            tmp = tmp / 10;
        }
        if (sum > 9) {
            return IntDigitSum(sum);
        } else {
            return sum;
        }
    }
    //endregion
}

