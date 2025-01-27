package week1.day4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputText = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		// Expected output: “We learn Java basics as part of sessions in week1”

		String[] newInput = inputText.split(" ");
		// System.out.println(newInput[0]);
		for (int i = 0; i <= newInput.length - 1; i++) {
			// System.out.println("I Index"+ i + newInput[i]);
			// count=0;
			for (int j = i + 1; j <= newInput.length - 1; j++) {
				// System.out.println("J Index" + j + newInput[j]);
				if (newInput[i].equalsIgnoreCase(newInput[j])) {
					// System.out.println("Word already exist");
					count++;
					newInput[j] =" ";
				}
			}
		}
		if (count >= 1) {
			for (int i = 0; i <= newInput.length - 1; i++) {
				// System.out.println("J Index" + j + newInput[j]);
				System.out.println(newInput[i]);
			}
		}
	}
}
