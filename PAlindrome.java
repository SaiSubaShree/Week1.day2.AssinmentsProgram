package week1.day2;

public class PAlindrome {

	public static void main(String[] args) {
		String pal = "Madam";
		char[] p = pal.toCharArray();
		char[] r = new char[pal.length()];
		int len = p.length;
		int j = 0;

		for (int i = len - 1; i <= len; i--) {
			if (i == -1)
				break;

			r[j] = p[i];
			j++;
		}

		String str1 = String.valueOf(r);
		System.out.println("r :" + str1);
		System.out.println("p :" + pal);

		if (str1.equalsIgnoreCase(pal) == true) {
			System.out.println("The string is the Palindrome");
		} else {
			System.out.println("The string is not the Palindrome");
		}
	}
}
