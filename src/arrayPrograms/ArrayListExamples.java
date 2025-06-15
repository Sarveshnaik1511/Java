package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {
	public static void main(String[] args) {
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("sarvesh");
		a.add("ulhas");
		a.add("naik");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a.size());
		
		// here i have removed 1 index
		a.remove(1);
		
		System.out.println("");

		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println(a.size());
		System.out.println("");
		
		//get method is used to get the value from particular index of arrayList
		System.out.println(a.get(1));
		System.out.println("");
		
		// enhanced for loop
		
		// It specifies data type, variable we have to assign, colon and name of the array
		
		for(String val:a)
		{
			System.out.println(val);
		}
		
		
		//Methods
		
		Boolean b =a.contains("naik");
		System.out.println(b);
		
		
		
		
		// convert normal array to List to use its methods
		
		String s[]= {"sarvesh","rohit","rajendra","virat","akshay"};
		
		// AsList() is the method present in Arrays
		List<String> convertedArray = Arrays.asList(s);
		System.out.println(convertedArray.contains("rohit"));
	}
	
	
	
	
	

	

}
