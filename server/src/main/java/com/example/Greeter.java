package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * This function is to greet someone
  */

  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
