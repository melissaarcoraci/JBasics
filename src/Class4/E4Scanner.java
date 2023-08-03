package Class4;

import java.util.Scanner;


public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        //creating the object of the Scanner class so we can re-use
        // the logic from this class which is already written for us by java devs
        Scanner scanner=new Scanner(System.in);
        //taking an input from the user and storing in int a name variable
        String name = scanner.next();
        if(name.equals("Melissa")){
        System.out.println("Java Instructor");
    } else {
            System.out.println("I don't know you");
        }
        //System.out.println("Hello "+name);
}}
