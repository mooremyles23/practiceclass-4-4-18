
public class secondsmallest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbs = {18, 21, 2, 12,70,16};		
		
		int smallest= numbs[0];
		int secondsmallest= numbs[0];
		for (int i = 0; i<numbs.length; i++){
		if (numbs[i]< smallest){
		
			smallest=numbs[i];
		}
		}
	for	(int i = 1; i<numbs.length; i++){
		if (numbs[i]< secondsmallest&& numbs[i]>smallest){
			secondsmallest=numbs[i];
		}
		
	
		
}
	System.out.println(secondsmallest);
	
	}
		}
