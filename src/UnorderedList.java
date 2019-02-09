import java.io.IOException;


public class UnorderedList {

	public void unorderedListDemo() throws IOException {
		
		String search, path = "/home/admin1/eclipse-workspace/DataStructures/text.file";
	
		LinkedListClass llc = Utility.Read1LineFile(path);
		llc.print();
		System.out.println("Enter the object to be searched");
		search = Utility.isString();
		if(llc.search(search)) {
			llc.deleteObject(search);
		}
		else {
			llc.add(search);
		}
		llc.print();
	}	
}
