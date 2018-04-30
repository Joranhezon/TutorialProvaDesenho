
public class HouseBuilderDirector {
	private HouseBuilder builder;
	
	public void HouseBuildDirector(final HouseBuilder builder) {
		this.builder = builder;
	}
	
	public House construct() {
		return builder.buildFloor().buildWall().buildRoof().build();
	}
	
}
