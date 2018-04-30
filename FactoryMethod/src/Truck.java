
public class Truck implements Vehicle {

	Truck() {
		/* Constructor is protected so that the client code can't use the "new" operator */
	}
	
	@Override
	public void design() {
		System.out.println("Designing Truck");
	}
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing Truck");
	}
}
