import java.util.Scanner;


public class REVE {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I love India" ;
//int lok =str.length();
int str1 = str.length();


System.out.println("String length"+str.length());

for(int i=str.length()-1; i>=0; i-- )
{
	str1 = str1 + str.charAt(i);
    System.out.println("Reverse of entered string is: "+str1);
	return;
}
		
	}
}
