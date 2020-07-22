package behavioral;

public class Building extends BuildingTemplate {
	@Override
	public void buildWall() {
		System.out.println("Building beautiful Wall");
	}

	@Override
	public void buildPillar() {
		System.out.println("Building beautiful Pillar");
	}


}
