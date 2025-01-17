package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkList {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(12);
		list.add("sarvesh");
		
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	

}
