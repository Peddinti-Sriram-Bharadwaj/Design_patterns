package com.patterns;

public class Main{
  public static void main(String[] args){
    String sampleXml = "<data><value>124</value></data>";

    IXmlData dataProcessor;

    JsonAnalyticsLibrary newLibrary = new JsonAnalyticsLibrary();

    dataProcessor = new XmlToJsonAdapter(newLibrary);

    System.out.println("Client is processing data...");
    dataProcessor.processXml(sampleXml);
  }
}
