
public class VehicleFactory {

	/* This is the factory method used by the client side to obtain an object.
	 * The client side does not need to know how an object is created internally.
	   The client requests for an object by passing the desired type. */
	
	public Vehicle getVehicle(String vehicleType) throws VehicleTypeNotFoundException {
		
		if(vehicleType == null){
			return null;
		}
		
		Vehicle vehicle = null;
		
		switch (vehicleType) {
			case "car":
				vehicle = new Car();
				break;
			case "motorcycle":
				vehicle = new Motorcycle();
				break;
			case "truck":
				vehicle = new Truck();
				break;
			default:
				throw new VehicleTypeNotFoundException();
		}
		
		return vehicle;
	}
}
