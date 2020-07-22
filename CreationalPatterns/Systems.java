package creational;

public abstract class Systems {
	
	public abstract String getPrimaryStorage();
	public abstract String getSecondaryStorage();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getPrimaryStorage()+", HDD="+this.getSecondaryStorage()+", CPU="+this.getCPU();
	}


}
