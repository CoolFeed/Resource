package java.designpattern.observer;

public abstract class Event {
   public abstract String getSource();
   public abstract String getTarget();
   public abstract Object getPaylad();
}
