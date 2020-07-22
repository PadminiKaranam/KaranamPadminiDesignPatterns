package creational;

public class Server extends Systems {
	
	private String ram;
	private String hd;
	private String cpu;
	
	public Server(String ram, String hd, String cpu){
		this.ram=ram;
		this.hd=hd;
		this.cpu=cpu;
	}
	@Override
	public String getPrimaryStorage() {
		return this.ram;
	}

	@Override
	public String getSecondaryStorage() {
		return this.hd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}



}
