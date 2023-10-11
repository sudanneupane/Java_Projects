import java.util.Scanner;
import java.util.Random;

public class Password_Generator
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int leng = sc.nextInt();
        System.out.println("Do you want to include nubers? yes/no");
        String number = sc.nextLine();
        System.out.println("Do you want to include Uppercase characters");
        String upp = sc.nextLine();
        System.out.println("Do you want to include Symbols/Secial characters");
        String spec = sc.nextLine();

        // Defining the alphabet and the special charactors
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*()_+?/";

        Random ran = new Random();
        int option ;        // to rendomly select the option like alphabet/ number/ uppercase/ special character
        int content;        // to randomly select the content like abc/ 123/ ABC/ !@#

        String passkey = "";     // to store the randomly generated character 

        // Loop to choose each random character till length leng
        for (int i = 0; i<leng; i++)
        {
            option = ran.nextInt(1,4);
            switch (option)
            {
                case 1:
                    content = ran.nextInt(1,26);
                    passkey = passkey + alpha.charAt(content);
                    break;
                case 2:
                    content = ran.nextInt(1,26);
                    passkey = passkey + alpha.charAt(content);
                    break;
                case 3:
                    content = ran.nextInt(1,26);
                    passkey = passkey + Character.toUpperCase(alpha.charAt(content));
                    break;
                case 4:
                    content = ran.nextInt(1,special.length());
                    passkey = passkey + special.charAt(content);
                    break;


            }




        }



        



    }
}