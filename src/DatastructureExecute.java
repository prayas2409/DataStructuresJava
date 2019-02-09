
public class DatastructureExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num;
			do {
				String[] Questions = { "UnorderedList", "OrderedList" };
				for (int i = 0; i < Questions.length; i++) {
					System.out.println("Enter " + (i + 1) + "for: " + Questions[i]);
				}
				System.out.println("Enter 0 to close");
				num = Utility.isInteger();
				//// to check if number >

				switch (num) {

				case 0:
					return;

				case 1:
					UnorderedList ul = new UnorderedList();
					ul.unorderedListDemo();
					break;
				case 2: 
					OrderedList ol = new OrderedList();
					ol.orderedListDemo();
					break;					
				default:
					System.out.println("Not yet created ");
					break;
				}
			} while (num != 0);

		} catch (Exception e) {
			System.out.println("The process is stopped because " + e);
		}
	}
}
