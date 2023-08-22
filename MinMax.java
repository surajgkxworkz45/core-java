
class MinMax{


public static void main(String[] args){
int array[]={99,34,68};
int max = array[0];
int min = array[0];

for(int index=0;index<array.length;index++){
	
if(array[index] > max){
max=array[index];
}
else if(array[index] < min){
min=array[index];

}
//System.out.println("maximum valu is" + max + "minimum value is " + min);
}
System.out.println("maximum valu is" + max + "minimum value is " + min);
}

}