package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] Set1= {19,1,7,9,2};
int[] Set2= {5,1,3,19,2};
int s1= Set1.length;
int s2= Set2.length;
for(int i=0;i<s1;i++)
{
	for(int j=0;j<s2;j++)
	{
		if(Set1[i]==Set2[j])
		{
			System.out.println(" The common value is " + Set1[i] +" found " );
		}
	}
	}


System.out.println(" No other match is found");


	}

}
