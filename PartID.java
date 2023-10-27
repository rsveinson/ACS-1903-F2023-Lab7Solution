/**
 * ACS-1903 Lab7 Q7
 * @author (your name and student number)
 */
import java.util.Scanner;

public class PartID{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the part ID:");
        String id = kb.next();

        // enter your code here
        boolean valid = true;       // assume the id is valid

        /* test for length, less than 3
         * or more than 5 and the id is invalid
         */
        if(id.length() < 4 || id.length() > 5){
            valid = false;
        }// end not valid
        else{
            /* if we get to the else clause we know
             * that the id is either 4 or 5 characters
             * we will only change valid if we find an
             * invalid character i.e. not a letter
             */

            for(int i = 0; i < id.length(); i++){
                // check to see if charAt(i) is nota letter
                if(!Character.isLetter(id.charAt(i))){
                    valid = false;
                }// end if not valid
                // no else here, we don't change valid back to true
                // if we encounter a valid character
            }// end for

        }// end else 
        
        System.out.println(valid ? "Valid" : "Invalid");

    }// end main

}

