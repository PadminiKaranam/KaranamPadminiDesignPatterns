package creational;

import creational.Systems;
import  creational.PC;
import  creational.Server;

public class SystemFactory {
	
	public static Systems getSystems(String type, String ram, String hd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hd, cpu);
		
		return null;
	}


}
