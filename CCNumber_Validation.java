import java.util.Scanner;



public class CCNumber_Validation {

public static boolean isValid(long number){
    int size = getSize(number);
    if (size < 13 || size > 16){
        return false;
    }else
    return true;
}

public static int sumOfDoubleEvenPlace(long number){
  
    int sum = 0;
    String numString = String.valueOf(number);

    for (int i = numString.length() -2 ; i >= 0; i = i -2) {
        int digit = Character.getNumericValue(numString.charAt(i));
        sum = sum + getDigit(digit *2);
        
    }

    return sum;
}
 /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
public static int getDigit(int number) {
    if (number < 10) {
         return number;
    }else {
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        return firstDigit + secondDigit;
    }
}

public static int sumOfOddPlace(long number){
    int sum = 0;
    String numString = String.valueOf(number);

    for(int i = numString.length() - 1; i >= 0; i = i - 2 ){
        int digit = Character.getNumericValue(numString.charAt(i));
        sum = sum + digit;
    }
    return sum;
}

public static boolean prefixMatched(long number, int d){
    return true;

}

public static int getSize(long d){
    String numString = String.valueOf(d);
    return numString.length();
}

public static long getPrefix(long number, int k){
    long prefix = 0;
    return prefix;
}



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long interger: ");
        long number = input.nextLong();
        if (isValid(number)){
            System.out.println(number + " is valid");
        }else {
            System.out.println(number + " is not valid");
        };
    
        System.out.println(number);

        input.close();

    }
}
