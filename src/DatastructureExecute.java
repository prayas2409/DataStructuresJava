
public class DatastructureExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num;
			do {
				String[] Questions = { };
				for (int i = 0; i < Questions.length; i++) {
					System.out.println("Enter " + (i + 1) + "for: " + Questions[i]);
				}
				System.out.println("Enter 0 to close");
				num = Utility.inputPositiveInteger();
				//// to check if number >

				switch (num) {

				case 0:
					return;

				case 1:
					
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
