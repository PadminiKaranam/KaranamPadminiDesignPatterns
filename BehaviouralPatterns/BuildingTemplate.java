package behavioral;

public abstract class BuildingTemplate {
	public final void buildFloor(){
		buildFoundation();
		buildPillar();
		buildWall();
		buildWindows();
		System.out.println("Building is constructed.");
	}

	private void buildWindows() {
		System.out.println("Building beautiful Windows");
	}
	public abstract void buildWall();
	public abstract void buildPillar();

	private void buildFoundation() {
		System.out.println("Building beautiful foundation");
	}


}
