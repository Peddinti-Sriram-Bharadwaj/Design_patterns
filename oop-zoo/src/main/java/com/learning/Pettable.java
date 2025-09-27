package com.learning;

/**
 * This is an INTERFACE.
 * It's a contract that defines a capability. Any class that implements
 * Pettable MUST provide a 'bePetted' method
 * It specifies WHAT a class can do, not HOW it does it.
 */

public interface Pettable{
  //Interface methods are public and abstract by default.

  void bePetted();
}
