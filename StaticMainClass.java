package staticDemo;

public class StaticMainClass {

	public static void main(String[] args) {
		// Static Demo Example

		StaticDemoClass s1 = new StaticDemoClass("bmw");
		System.out.println("Make of car is:" +s1.getMake());
		System.out.println("The instance num is :"+s1.getInstanceNum());
		
		StaticDemoClass s2 = new StaticDemoClass("benz");
		System.out.println("Make of car is:" +s2.getMake());
		System.out.println("The instance num is :"+s2.getInstanceNum());
	}

}
