package com.project.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Computer gamingPc = new Computer.Builder("Intel i9", 32)
        .storage(1024)
        .gpu("NVIDIA RTX 4080")
        .os("Windows 11")
        .build();

      System.out.println(gamingPc);
      System.out.println("---");

      Computer officePC = new Computer.Builder("Intel i5", 16)
        .build();

      System.out.println(officePC);
    }
}
