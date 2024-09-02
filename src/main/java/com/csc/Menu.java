package com.csc;

import java.util.Scanner;

// Your code goes here!
public class Menu {
  public static void main(String[] args)
  {
    int i;
    
    i = promptInteger(true, 10, true, 20, "Give integer between 10 and 20 inclusive.", "Bad number! Try again.");
    
    if (i > 20 || i < 10) {
      System.out.println(String.format("Bad number got through! Number: %d", i));
    } else {
      System.out.println(String.format("Number provided: %d", i));
    }
    
    i = promptInteger(true, -20, true, -10, "Give integer between -10 and -20 inclusive.", "Bad number! Try again.");
    
    if (i > -10 || i < -20) {
      System.out.println(String.format("Bad number got through! Number: %d", i));
    } else {
      System.out.println(String.format("Number provided: %d", i));
    }
    
    i = promptInteger(false, 0, true, -10, "Give integer less than -10.", "Bad number! Try again.");
    
    if (i > -10) {
      System.out.println(String.format("Bad number got through! Number: %d", i));
    } else {
      System.out.println(String.format("Number provided: %d", i));
    }
    
    i = promptInteger(false, 0, false, 0, "Give any integer.", "Bad integer.");
    
    System.out.println(String.format("Number provided: %d", i));
  }
  
  private static boolean is_value_between_or_at_bounds(int lower_bound, int upper_bound, int value) {
    return ((lower_bound <= value) && (upper_bound >= value));
  }
  
  public static int promptInteger(boolean use_lower_bound, int lower_bound, boolean use_upper_bound, int upper_bound, String question_prompt, String error_prompt) {
    Scanner in = new Scanner(System.in);
    
    while (true) {
      System.out.println(question_prompt);
      int value = in.nextInt();
      
      // these checks will ensure that if we aren't supposed to use the bounds, the bounds will always succeed when compared against.
      if (!use_lower_bound) lower_bound = value;
      if (!use_upper_bound) upper_bound = value;
      
      if (Menu.is_value_between_or_at_bounds(lower_bound, upper_bound, value)) {
        return value;
      }
      
      System.out.println(error_prompt);
      System.out.println("");
    }
  }
}