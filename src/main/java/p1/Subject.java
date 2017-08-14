package p1;

import java.util.ArrayList;
import java.util.List;

/*
 * Subject----主题或者抽象通知者，一般用一个抽象类或者一个接口实现，它把所有对观察者
 * 
 * 对象的引用保存在一个聚集里，每个主题都可以又任何数量的观察者。抽象主题提供一个接口，
 * 
 * 可以增删观察者对象。
 * */

public interface Subject 
{

	 public List  observers=new ArrayList();
	 
	 //增加观察者
	 public void add(Observer observer);
	 
	 //删除观察者
	 public void delete(Observer observer);
	 
	 //通知观察者
	 public void notifyObserver();
	
}
