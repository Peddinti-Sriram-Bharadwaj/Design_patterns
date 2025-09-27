package com.project.templatemethod;

public class PdfDataMiner extends DataMiner{
  @Override
  protected void extractData(){
    System.out.println("Extracting data from PDF file...");
    
  }

  @Override
  protected void parseData(){
    System.out.println("Parsing data from the PDF file (extracting text, images)...");
  }
}
