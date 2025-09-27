package com.project.structural;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("- - - DECORATOR DEMO - - -");

       Notifier fullNotifier = new SlackNotifierDecorator(
           new SmsNotifierDecorator(
             new EmailNotifier()
             )
           );

       fullNotifier.send("Your order #12345 has been confirmed.");

       System.out.println("\n - - - Adapter Demo - - -");
       ThirdPartySmsService legacySms = new ThirdPartySmsService();
       Notifier adaptedSmsNotifier = new SmsAdapter(legacySms, "555-123-4567");
       adaptedSmsNotifier.send("This message is sent via the adapter.");
    }
}
