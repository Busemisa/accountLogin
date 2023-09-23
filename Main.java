import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int password;
        boolean isPasswordSuccess = true;

        Scanner input = new Scanner(System.in);

        while(isPasswordSuccess){
            System.out.print("Please enter your password : ");
            password=input.nextInt();

            if(password==123){
                System.out.println("Password entered correctly");
                isPasswordSuccess = false;
            }
            else{
                System.out.println("Wrong password!!");
            }

        }


    }
}
