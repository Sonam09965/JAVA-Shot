import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //MINI PROJECT
        Scanner sc = new Scanner(System.in); //Creating an object for the Scanner class.
        int myNum = (int)(Math.random()*100);  //Declaring a variable myNum to take value of any random number.
        int userNum;
        do{
            System.out.println("Guess My Number(1-100) : ");
            userNum = sc.nextInt();

            if(userNum == myNum){
                System.out.println("WOHOO......CORRECT NUMBER!!!!");
                break;
            }
            else if(userNum > myNum){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }
        } while(userNum >= 0);

        System.out.println("My number was : ");
        System.out.print(myNum);
    }
}