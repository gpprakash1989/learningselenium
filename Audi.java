public class Audi extends Car {

	public int speed = 145;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Audi A= new Audi();
A.printdetail();
	System.out.println("Colour of Audi -----"+A.colour);
	
	System.out.println("Fuel of Audi-----"+A.getfuel());
	}
	
public void printdetail()
{
	System.out.println("Wheel of Audi"+wheels);
	System.out.println("Speed of Audi"+speed);

	seats();
//System.out.println("Wheels of Audi"+type);
}

}