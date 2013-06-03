package java.designpattern.observer;

import java.util.ArrayList;
import java.designpattern.observer.Consumer;

public class EventManager<T> {
   private ArrayList<? extends Consumer> consumer = new ArrayList<Consumer>();
   
   public void register(Consumer consumer, Class<T> clasz){
	   
   }
   
   public void fireEvent(Event e){
	   
   }
}
