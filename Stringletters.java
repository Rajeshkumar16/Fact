package Demo;

public class str2 {
	public static void main(String[] args) {

		userMethod("priya");
	}

	public static void userMethod(String input1) {

		String word = input1;
		int k = word.length();

		int j = 0;

		for (j = 0; j < word.length(); ++j) {

			if (Character.isLowerCase(word.charAt(j))) {
				int t = word.charAt(j) - (int) 'a' + 1;
				System.out.print(t);

			}

			else if ((Character.isUpperCase(word.charAt(j)))) {
				int t1 = word.charAt(j) - (int) 'A' + 1;

				System.out.print(t1);

			}

		}

	}
}
