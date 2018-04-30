
public class Car implements Vehicle {

	Car() {
		/* Constructor is protected to avoid the client using the new operator */
	}
	
	@Override
	public void design() {
		System.out.println("Designing Car");
	}
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing Car");
	}
}
