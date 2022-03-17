package Lab2;

public interface Queue<T>  {
 
	   public boolean isEmpty();
	   public Object getFrontElement();
	   public Object getRearElement();
	   public void put(Object theObject);
	   public Object remove();
	   public void showQueue();
	   }