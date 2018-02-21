
public class Vechile_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vechile_Object bicycle = new Vechile_Object("Black", 2 , 45000 , 3.77);
Vechile_Object motorcycle = new Vechile_Object ("Gery",2,76000,60.06);
Vechile_Object Car = new Vechile_Object ("White",4,576000,23);
	}
	
	public Vechile_Object(String Color, int wheels, int price, double Speed) {
		// TODO Auto-generated constructor stub
		System.out.println("Color of Vechile is(Color = "+Color+", wheels = "+wheels+", price = "+price+", Speed = "+Speed);
	}
}
