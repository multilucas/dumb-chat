import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class conditions1 {
    public static void main(String[] args) {

        Scanner  stringIn = new Scanner (System.in);
        Scanner  intIn = new Scanner (System.in);
        LocalDate dateOut = LocalDate.now();
        LocalTime timeOut = LocalTime.now();

        System.out.println("what's your name?");
        String userName = stringIn.nextLine();

        System.out.println("what's you age?");
        int userAge = intIn.nextInt();

        if(userAge >= 18) {
            System.out.println("Hello " + userName + "!" + " welcome");
            char response = '4' ;
            char responseAccount = '0';
            float firstNumber = 0;
            float secondNumber = 0;
            float resultSum = 0;

            while(response != 0){
                System.out.println("Talk me, what you need?");
                System.out.println("(1) Take the date today");
                System.out.println("(2) Take the what's the hours now");
                System.out.println("(3) Make a mathematical account");
                System.out.println("(0) Exit");
                response = stringIn.next().charAt(0);

                if(response == '1') {
                    System.out.println("Today is " + dateOut);
                }else if (response == '2'){
                    System.out.println("Now is " + timeOut);
                }else if (response == '3'){
                    System.out.println("Type it the first number");
                    firstNumber = intIn.nextInt();
                    System.out.println("Type it the second number");
                    secondNumber = intIn.nextInt();
                    System.out.println("what you need make?");
                    System.out.println("(1) Add");
                    System.out.println("(2) Subtract");
                    System.out.println("(3) to divide");
                    System.out.println("(4) Multiply");
                    responseAccount = stringIn.next().charAt(0);
                    if(responseAccount == '1'){
                        System.out.println("Your result's: " + (firstNumber + secondNumber));
                    }else if(responseAccount == '2') {
                        System.out.println("Your result's: " + (firstNumber - secondNumber));
                    }else if(responseAccount == '3') {
                        System.out.println("Your result's: " + (firstNumber / secondNumber));
                    }else {
                        System.out.println("Your result's: " + (firstNumber * secondNumber));
                    }
                }
                else break;
        }
        } else {
            System.out.println("You don't have permission for acess this!");
        }
    }
}