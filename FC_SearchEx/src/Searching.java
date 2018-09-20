
public class Searching {

	public Searching() {
		
	}
	
	
	public int binarySearch(int[] A, int key) {
		int lowIndex=0;
		int highIndex=A.length-1;
		int midIndex=findMiddle(lowIndex, highIndex);
		
		while((lowIndex+1)<highIndex) {	
//			System.out.println("entering loop");
			int midValue=A[midIndex];
			if(key>midValue) {		//key above middle
				lowIndex=midIndex;
				midIndex=findMiddle(lowIndex, highIndex);
			}else if(key<midValue){ //key below middle
				highIndex=midIndex;
				midIndex=findMiddle(lowIndex, highIndex);
			}else {					//key at middle
				return midIndex;
			} //end if else
		} //end while
		
		//have narrowed it down to upper or lower value, or key not existing in array
		if(key==A[lowIndex]){
			return lowIndex;
		}else if(key==A[highIndex]){
			return highIndex;
		}else {
			return -1;
		
		}
		
	}
	
	
	public int linearSearch(int[]A, int key) {
		
		for(int i=0;i<A.length;i++) {
			if(key==A[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public int findMiddle(int low, int high) {
		int middle=(int)((high-low)/2)+low;
		
		return middle;
	}
}
