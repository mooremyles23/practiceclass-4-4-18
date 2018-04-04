
public class largestarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbs = {6, 18, 21, 1, 72, 13};		
		
		int largest= numbs[0];
		
		for (int i = 0; i < 6; i++){
		if (numbs[i]> largest){
		
			largest=numbs[i];
	}
	System.out.println(largest);
		
}}}
