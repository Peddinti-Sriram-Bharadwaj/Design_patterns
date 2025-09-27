package com.project.structural;

public class SlackNotifierDecorator extends BaseNotifierDecorator{
  public SlackNotifierDecorator(Notifier notifier){
    super(notifier);
  }

  @Override
  public void send(String message){
    super.send(message);
    sendSlack(message);
  }

  private void sendSlack(String message){
    System.out.println("Sending Slack message: " + message);
  }
}
