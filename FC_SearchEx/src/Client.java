
public class Client {

	public static void main(String[] args) {
		
		int[]A=new int[] {0,1,2,3,4,5};
		
		Searching s=new Searching();

		int result=s.binarySearch(A, -5);
//		int result=s.linearSearch(A, -5);
		System.out.println(result);
		
		
		
	}
	
	
}
