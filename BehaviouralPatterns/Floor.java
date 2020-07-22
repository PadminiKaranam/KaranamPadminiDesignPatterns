package behavioral;

public class Floor extends BuildingTemplate{
	@Override
	public void buildWall() {
		System.out.println("Building wonderful Walls");
	}

	@Override
	public void buildPillar() {
		System.out.println("Building wonderful Pillars");
	}

}
