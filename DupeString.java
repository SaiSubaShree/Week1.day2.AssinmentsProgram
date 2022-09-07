package week1.day2;

import java.util.Arrays;

public class DupeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "we learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] sta = st.split(" ");
		int len = sta.length;

		System.out.println("The length of string is:" + len);

		for (int i = 0; i <= len - 1; i++) {
			for (int j = 0; j <= len - 1; j++) {
				if (i != j) {
					if (sta[i].equals(sta[j])) {
						count++;

						if (count >= 1) {
							sta[j] = "";
						}
					}
				}

			}
		}
		for (int x = 0; x < sta.length; x++) {
			if (sta[x] != "")
				System.out.print(sta[x] + " ");
		}

	}
}
