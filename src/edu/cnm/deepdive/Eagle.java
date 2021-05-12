package edu.cnm.deepdive;

public class Eagle extends Bird {

  public int fly (int height) {
    System.out.println("Eagle is flying at " + height + "meters.");
    return height;
  }//this is an overloaded method because it has a different parameter than the super class.

  @Override
  public void eat(int amount) {
    System.out.println("Eagle is eating " + amount + " units of food.");
  }
  //this method is overridden. See the annotation. Same method with same parameters as in super class
  // but with different outcome.

}
