package oplab2;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class testInput {

    public static void main(String[] args) throws IOException {

 //       BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

 //       Input Data by using BufferedReader
        System.out.print("What is your name?: ");
        String name = reader.readLine();
        System.out.println("You name is "+name);
        System.out.print("How old are you?: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("you are "+age+"years old.");

  //      Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where are you from?: ");
        String address = scanner.nextLine();
        System.out.println("you come from "+address);
        System.out.print("What is your weight?: ");
        double weight = scanner.nextDouble();
        System.out.println("your weight: "+weight);




    }//main


}// class

