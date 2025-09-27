package com.project.structural;

public abstract class BaseNotifierDecorator implements Notifier{
  protected final Notifier wrappedNotifier;

  public BaseNotifierDecorator(Notifier notifier){
    this.wrappedNotifier = notifier;
  }

  @Override
  public void send(String message){
    wrappedNotifier.send(message);
  }
}
