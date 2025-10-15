package com.patterns;

public class XmlToJsonAdapter implements IXmlData{
  private final JsonAnalyticsLibrary analyticsLibrary;

  public XmlToJsonAdapter(JsonAnalyticsLibrary analyticsLibrary){
    this.analyticsLibrary = analyticsLibrary;
  }

  @Override
  public void processXml(String xmlData){
    System.out.println("Adapter received XML: " + xmlData);

    String jsonData = convertXmlToJson(xmlData);

    analyticsLibrary.analyzeJson(jsonData);
  }

  private String convertXmlToJson(String xmlData){
    System.out.println("...Converting XML to JSON...");
    return "{\"data\": \"" + xmlData.replaceAll("<[^>]*>", "") + "\" }";
  }
}
