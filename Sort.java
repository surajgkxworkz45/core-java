
import java.util.*;
class Sort{

static int array[]={125,52,78,45,96};


public static void main(String[] args){



 for(int index=0;index<array.length;index++){
	
	
	for(int otherindex=index+1;otherindex < array.length;otherindex++)
		
		
		
		if(array[index]  > array[otherindex]){
			
			
		int temp=array[index];
			array[index]=array[otherindex];
			array[otherindex]=temp;
			
			
			}
			}
System.out.print("--------------------withou using sort method-------------------------");
			
System.out.println(Arrays.toString(array));*/
	
System.out.println("--------------------------using sort method---------------------------------");
Arrays.sort(array);
System.out.println(Arrays.toString(array));

	


}


}