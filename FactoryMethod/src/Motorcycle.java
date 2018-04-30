
public class Motorcycle implements Vehicle {
	
	Motorcycle() {
		/* Constructor is protected so that te client code can't use the ''new'' operator */
	}
	
	@Override
	public void design() {
		System.out.println("Designing Motorcycle");
	}
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing Motorcycle");
	}
}
