
public class String_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1 = "This world is very nice";
		String st2 = "And beautiful " ;
		
		
		// comparing string 
		System.out.println("st1 equals to st2 ---> " +st1.equals(st2));
		
		// concatenates string
		System.out.println("concatenate of st1 and st2 ---> " +st1.concat(st2));
		
		// //Retrieve the 9th Indexed character from string.
		System.out.println("character at index 9 ----> "+st1.charAt(9));
		
		//find length of string
		System.out.println("Find the length of string ----> " +st1.length());
		
		//converting whole string into lower case 
		System.out.println("converting string into lower case --->" +st1.toLowerCase());
		
		//converting whole string into Uper case
		System.out.println("converting string into upper case ---->" +st1.toUpperCase());
		
		//Retrieve i from string 
		System.out.println("Retrieve i from string --" +st1.indexOf('i'));
		
		//Retrieve the index of second most 'i' character
		System.out.println("retrieve second most i from string --->" +st1.indexOf('i', 3));
		
		//Retrieve the Index of word 'Very' from string. 
		System.out.println("Index of word Very Is -> "+st1.indexOf("very")) ;
		
		//Converting value into string 
		int j = 75;
		String val2 = String.valueOf(j);
		System.out.println("Value Of string val2 Is -> "+val2);
		
		// Converting string into integer
		String val1 = "75";
		int i = Integer.parseInt(val1);
		System.out.println("Converting string into integer----" +1);
		
		
		//Print the String starting from 5th Index to 12th Index
		System.out.println("Retriveing sub string from string " +st1.substring(5, 18));
		
		//Split string
		String split[] = st1.split("very");
		System.out.println("String part1 is " +split[0]);
		System.out.println("String part1 is " +split[1]);
		
		
		//Trim String. 
		System.out.println("Trimmed st2 -> "+st2.trim());
		
		//==================QA Mentor Class-======================
//String length 
		String line = "MY name is Lokesh Sharma";
		int linelength = line.length();
	System.out.println(" line length --->"+linelength);
	
	//String empty
	
	System.out.println("String length is empty--->"+line.isEmpty());
	System.out.println("Line Contains is---"+line.contains("is"));
	
	//Substring
	String str = "Price : 4.99 $";
	int start = str.indexOf(":") + 2;
	int end = str.indexOf("$") -1;
	System.out.println(str.substring(start, end));
	
	System.out.println();
	}

	
}
