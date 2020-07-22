package creational;

import creational.SystemFactory;
import creational.Systems;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Systems pc = SystemFactory.getSystems("pc","16 GB","1500 GB","3.8 GHz");
		Systems server = SystemFactory.getSystems("server","64 GB","1 TB","6.7 GHz");
		System.out.println("Factory PC Config:"+pc);
		System.out.println("Factory Server Config:"+server);

	}

}
