package com.project.templatemethod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      System.out.println("- - - Mining PDF Document - - -");
      DataMiner pdfMiner = new PdfDataMiner();
      pdfMiner.mine("document.pdf");

      System.out.println("\n- - - Mining CSV Document - - -");
      DataMiner csvMiner = new CsvDataMiner();
      csvMiner.mine("data.csv");
    }
}
