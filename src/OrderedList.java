import java.io.FileNotFoundException;
import java.io.IOException;

public class OrderedList {

	public void orderedListDemo() throws IOException{
		
		String path = "/home/admin1/eclipse-workspace/DataStructures/orderedlist.txt";
		System.out.println("Enter the number of elements to be entered");
		
		
		/*String str="";
		while(count>=i) {
			str = str + Utility.isInteger() +" "; 
			i++;			
		}
		Utility.appendToFile(path, str);
		*/
		LinkedListClass llc = Utility.Read1LineFile(path);
		llc.print();
		llc.sort();
		System.out.println("After sort");
		llc.print();
		System.out.println("Enter the number to be searched");
		int num = Utility.isInteger();
		if(llc.search(""+num)) {
			llc.deleteObject(""+num);
		}
		else {
			llc.add(""+num);
			llc.sort();
			llc.print();
		}
	}	
}
