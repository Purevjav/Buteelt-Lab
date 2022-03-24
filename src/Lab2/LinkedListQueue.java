package Lab2;
import java.util.*;

import buteelt.LinkedQueue;
 
class LinkedListQueue<T> {
    
	int front = -1, last = -1;
 
    // T turliin arraylist uusgeh
    ArrayList<T> A = new ArrayList<>();
 
    // queue-n ehnii elementiig butsaah
    T front()
    {
        if (front == -1)
            return null;
        return A.get(front);
    }
    // queue-n suuliin elementiig butsaah
    T last()
    {
        if (last == -1)
            return null;
        return A.get(last);
    }
   
    //Queue-d utga onooh
    void put(T X)
    {
    	if (this.empty()) {
            front = 0;
            last = 0;
            A.add(X);
        }
        else {
            front++;
            if (A.size() > front) {
                A.set(front, X);
            }
            else
                A.add(X);
        }
    }
    
    void remove()
    {
        if (this.empty())
            System.out.println("Queue is already empty!");
        else if (front == last) {
            front = last = -1;
        }
        else {
            last++;
        }
    }
 
    //Queue hooson esehiig shalgah
    boolean empty()
    {
        if (front == -1 && last == -1)
            return true;
        return false;
    }
    
    //Queue harah 
    public String showQueue()
    {
        if (this.empty())
            return "Queue is empty!";
 
        String result = "";
 
        for (int i = last; i < front; i++) {
            result += String.valueOf(A.get(i)) + ", ";
        }
 
        result += String.valueOf(A.get(front));
 
        return result;
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedQueue bool  = new LinkedQueue(10);
	boolean exit = false;
	String inputValue;
	
	Scanner king = new Scanner(System.in);
	System.out.println("How many number input? Enter your number: ");
	int n = king.nextInt();
	for(int k=0;k<n;k++)
	{
		bool.put(king.nextInt());			
	}
	bool.showQueue();
	command();
	
	try {
		while(exit==false)
		{
			System.out.print("\nCommand bicheerei: ");
			inputValue = king.next();
			
			switch(inputValue) {
			case "last": System.out.println(bool.getLastElement());
				break;
			case "first": System.out.println(bool.getFrontElement());
				break;
			case "empty":	System.out.println(bool.isEmpty());
				break;
			case "add":	System.out.println("Хэдэн тоо оруулах вэ?: ");
			int p = king.nextInt();
			for(int k=0;k<p;k++)
			{
				bool.put(king.nextInt());			
			}
			System.out.println("Succesful!");
				break;
			case "remove":	bool.remove(); System.out.println("\nFirst element successfully removed!");
				break;
			case "show": 	System.out.println("Recent Queue: "); bool.showQueue();
				break;
			case "exit": {
				king.close(); 
				System.exit(0); 
				break;
				}
				
			}
		}
	}catch(Exception e) {
		System.out.println(e);
	}
		
}
public static void command() {
	System.out.println("\n\n---- Command ----\n");
	System.out.println(" last   :  suuliin elementiig harah");
	System.out.println(" first  :  ehnii elementiig harah");
	System.out.println(" empty  :  hooson eshiig harah");
	System.out.println(" add    :  element nemeh");
	System.out.println(" remove :  element ustgah");
	System.out.println(" show   :  queue harah");
	System.out.println(" exit   :  garah");
}


}