
public class Array_Two_Dimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][] = new String[3][2];
		str[0][0] = "User1";
		str[1][0] = "User2";
		str[2][0] = "User3";
		str[0][1] = "Password 1";
		str[1][1] = "Password 2";
		str[2][1] = "Password 3";
		
		for( int i=0; i<str.length; i++)
		{
			
			for (int j=0; j<str[i].length; j++)
			{
			System.out.println(str[i][j]);
			//System.out.println("lenGtHH of first string is" +str[0][0].length() );		
				}

	}

	}
	
}