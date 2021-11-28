import java.util.Scanner;

public class Choice {
    public static int getChoice(){
        try{
            int choice = 0;

            while (choice != 1 && choice != 2){
                Scanner myObj = new Scanner(System.in);
                System.out.println("Which cave will you go into? (1 or 2)");
                choice =  myObj.nextInt();

                if(choice != 1 && choice != 2){
                    System.out.println("Invalid Input!");
                }
            }

            return choice;
        }catch(Exception e){
            System.out.println("You didnt input a valid number, and now the dragons are angry.");
        }
        return -1;
    }
}
