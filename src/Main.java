import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String partyAfilliation = "";
        // creat a scanner and read in the partyAffiliation

        System.out.println("Enter your part affiliation[RDI]: ");
        if (console.hasNextLine()) ;
        {
            partyAfilliation = console.nextLine();
            if (partyAfilliation.equalsIgnoreCase("R"))
            {
                System.out.println("You get a Republican Elephant");
            }
             else if (partyAfilliation.equalsIgnoreCase("D"))
            {
                System.out.println("You get a Democratic Donkey");
            }
             else if (partyAfilliation.equalsIgnoreCase("I"))
            {
                System.out.println("You get a Independent Man");
            }
            else
            {
                System.out.println("I don't know what party you belong to");
            }
        }
    }
}