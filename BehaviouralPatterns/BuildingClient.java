package behavioral;

public class BuildingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildingTemplate bt=new Floor();
		
		bt.buildFloor();
		System.out.println("**********");
		
		bt=new Building();
		
		bt.buildFloor();

	}

}
