package week1.day2;

public class ReverseEvenString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a software tester";
		String[] testChar= input.split(" ");
		int len = testChar.length;
		String reverseString="";
		String output=" ";
		
		
		for(int i=0;i<=len-1;i++)
		{		
			if(i%2!=0)
			{
				String odd = testChar[i];
				int lens = odd.length();
				
				for(int j=lens-1;j>=0;j--)
				{
					reverseString=reverseString+(odd.charAt(j));
				}
				
				output=output+reverseString+" ";
				reverseString = "";  //to reset the reverse
			}
			else
			{
				output=output+(testChar[i]+" ");
			}
			
			
		}
		
		System.out.println(output);
		

	}

}
