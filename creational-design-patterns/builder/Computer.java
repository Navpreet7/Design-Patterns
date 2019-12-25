package main.java.builder;

public class Computer {
	//required
	private String hdd;
	private String ram;
	//optional
	private boolean isGraphisCardenabled;
	public String getHdd() {
		return hdd;
	}
	public String getRam() {
		return ram;
	}
	public boolean isGraphisCardenabled() {
		return isGraphisCardenabled;
	}
	private Computer(ComputerBuilder builder) {
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.isGraphisCardenabled=builder.isGraphisCardenabled;
		
	}
	
	public static class ComputerBuilder{
		private String hdd;
		private String ram;
		//optional
		private boolean isGraphisCardenabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.ram=ram;
			this.hdd=hdd;
		}


		public ComputerBuilder setGraphisCardenabled(boolean isGraphisCardenabled) {
			this.isGraphisCardenabled = isGraphisCardenabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}
	public static void main(String args[]) {
		Computer comp = new Computer.ComputerBuilder("500gb","8gb").setGraphisCardenabled(true).build();
	}
	
}
