//Constructor Overloading !
public class Student1 {

	String Finame;
	String Miname;
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 stdn2 = new Student1("Mary", "Elizabeth");

	}

   public Student1(String Fname) {
		// TODO Auto-generated constructor stub
	   Finame = Fname;
	   System.out.println("1.First Name Is"+Finame);
	}
   public Student1(String Fname, String Mname) {
		// TODO Auto-generated constructor stub
	   this("Ram");
	   Finame = Fname;
	   Miname = Mname;
	   System.out.println("2.First Name Is-->"+Finame);
	   System.out.println("2.Middle Name Is--->"+Miname);
	}
}


