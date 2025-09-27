package com.project.solid;

import java.util.List;

public class AreaCalculator{
  public double sum(List<Shape> shapes){
    double totalArea = 0;
    for(Shape shape : shapes){
      totalArea += shape.area();
    }

    return totalArea;
  }
}
