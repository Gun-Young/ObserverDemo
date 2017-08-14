package p1;

public class Clinet 
{
       public static void main(String[] args)
       {
		       Subject subject=new RealSubject();
		       
		       Observer observer1=new RealObserver();
		       
		       Observer observer2=new RealObserver();
		       
		       Observer observer3=new RealObserver();
		       
		       subject.add(observer1);
		       
		       subject.add(observer2);
		       
		       subject.add(observer3);
		       
		       subject.notifyObserver();
		       
    	   
	   }
}
