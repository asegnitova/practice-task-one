package com.practice;
import com.practice.exception.ExceptrionInput;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Enter string: ");

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        try {
            System.out.println(String.format("In string " + "\"" + string + "\" " + countWord(string) + " words"));
        } catch (ExceptrionInput e){
            System.out.println(e.getMessage());
        }
    }

    public static int countWord(String str) throws ExceptrionInput {
        int count = 0;

        if (str.isEmpty() || str.matches(".*\\d.*")){
            throw new ExceptrionInput(String.format("Incorrect string \"%s\"", str));
        }
        for(String s : str.split(",|\\s")){
            count++;
        }
        return  count;
    }
}