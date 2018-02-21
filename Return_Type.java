
public class Return_Type {
	static int c;
	static double d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mul(2,3));
System.out.println(div(7,3));
message();
System.out.println("Multiply result "+c);
System.out.println(" Divison Print " +d);
	}

	private static double div(double i, double j) {
		// TODO Auto-generated method stub
		d = i/j;
		
		return d;
	}

	private static int mul(int i, int j) {
		// TODO Auto-generated method stub
	c = i*j;
	
	return c ;
	
	}
	private static void message() {
		// TODO Auto-generated method stub
		System.out.println("Test Message");
	}

}
