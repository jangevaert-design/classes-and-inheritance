package edu.cnm.deepdive;

public class Snake extends Reptile {

  @Override
  protected boolean hasLegs() {
    return false;
  }

  @Override
  protected double getWeight() {
    return 3.0;
  }

  //above two overridden methods from super class Reptile. They have the same parameters and return
  //type as the methods in super class.
  //the access modifiers can be same or less restricted. So in the cases above 'protected' and
  //'public' are accepted.
  //private and final methods cannot be overridden.
}
