package week1.day2;

public class IndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String change="changeme";
char[] ch=change.toCharArray();
String result ="";

System.out.println("The original String is " + change);

for(int i=0;i<ch.length;i++)
{
	if(i%2 !=0)
	{
		result= result+Character.toUpperCase(ch[i]);
		
			
	}
	else
	{
		result= result+ch[i];
	}
}
System.out.println("The final String is " + result);
	}

}
