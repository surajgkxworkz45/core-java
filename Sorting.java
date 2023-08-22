
class Sorting{
	public static void main(String[] args){
		
 int array[]={52,58,47,96,35};
 
 for(int index=0;index<array.length;index++){
	 
	 for(int otherindex=index+1;otherindex<array.length;otherindex++)
 
	 if(array[index] > array[otherindex]){
		 
		 int temp=0;
		 temp=array[index];
		 array[index]=array[otherindex];
		 array[otherindex]=temp;
	 
	 }
System.out.println(array[index]);
		
		
	}
	
}

}