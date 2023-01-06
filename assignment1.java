/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex.d1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegexD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email address: ");
        String studentNum = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("[A-Za-z]+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid student email address");
        } else {
            System.out.println("Invalid student email address");
        }
        
         System.out.print("Enter mobile number: ");
         studentNum = scan.nextLine();

        // Long method
         pattern = Pattern.compile("09+\\d{9}");
         matcher = pattern.matcher(studentNum);

         match = matcher.matches();

        if (match) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }

    }
}    
  
