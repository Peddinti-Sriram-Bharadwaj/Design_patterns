package com.project.solid;

import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      List<Shape> shapes = List.of(
          new Circle(10), 
          new Square(5));

      AreaCalculator calculator = new AreaCalculator();
      Outputter outputter = new Outputter();

      double sum = calculator.sum(shapes);
      outputter.printSum(sum);
    }
}
