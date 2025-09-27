package com.patterns;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        if(config1 == config2){
          System.out.println("Config1 and config2 are the SAME instance");
        }

        System.out.println("\nOriginal theme: " + config1.getSetting("theme"));

        System.out.println("Changing theme using config2...");
        config2.setSetting("theme", "light");

        System.out.println("Theme from config1 is now: " + config1.getSetting("theme"));
    }
}
