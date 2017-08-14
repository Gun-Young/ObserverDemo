package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 真实通知者
 * 
 * */

public class RealSubject  implements Subject
{

	private List observers=new ArrayList();
	public void add(Observer observer)
	{
            observers.add(observer);
		      
	}

	public void delete(Observer observer) {

		   observers.remove(observer);
	}

	public void notifyObserver() 
	{
            Iterator it=observers.iterator();
            
            while(it.hasNext())
            {
            	Observer obs=(Observer) it.next();
            	
            	obs.update();
            }
		
	}

}
