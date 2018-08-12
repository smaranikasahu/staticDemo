package staticDemo;

public class StaticKeyNotes {
	public  static int number=10;
	public int nom=11;
	public static void main(String[] args) {
		// Notes //
		/* Static method cannot use the non static variable or method directly*/
		/*This and Super cannot be used in the static context*/
		
		int output= add(20);
		System.out.println(" Static Sum is "+output);
		
		StaticKeyNotes s1 = new StaticKeyNotes();
		System.out.println("The non static sum is "+s1.sum(11));
		
	}
		public static int add(int num) {
		return num+number;
	}
	
		public int sum(int no) {
		return nom+no;
		}
}