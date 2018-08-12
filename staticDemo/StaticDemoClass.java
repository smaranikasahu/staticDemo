package staticDemo;

public class StaticDemoClass {
	private String make;
	private  static int instanceNum=0;
	
	public  StaticDemoClass(String make) {
		this.make=make;
		instanceNum++;
		
	}

	public String getMake() {
		return make;
	}
	
	
	public int getInstanceNum() {
		return instanceNum;
	}
	
}
