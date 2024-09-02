package com.csc;

import java.util.Scanner;

// Your code goes here!
public class Menu {
  public static void main(String[] args)
  {
    int i;
    
    i = promptInteger(10, 20, "Give integer between 10 and 20 inclusive.", "Bad number! Try again.");
    
    if (i > 20 || i < 10) {
      System.out.println(String.format("Bad number got through! Number: %d", i));
    } else {
      System.out.println(String.format("Number provided: %d", i));
    }
    
    i = promptInteger(-20, -10, "Give integer between -10 and -20 inclusive.", "Bad number! Try again.");
    
    if (i > -10 || i < -20) {
      System.out.println(String.format("Bad number got through! Number: %d", i));
    } else {
      System.out.println(String.format("Number provided: %d", i));
    }
  }
  
  public static int promptInteger(int lower_bound, int upper_bound, String question_prompt, String error_prompt) {
    Scanner in = new Scanner(System.in);
    
    System.out.println(question_prompt);
    int value = in.nextInt();
    while (value < lower_bound || value > upper_bound) {
      System.out.println(error_prompt);
      System.out.println("");
      System.out.println(question_prompt);
      value = in.nextInt();
    }
    
    return value;
  }
}