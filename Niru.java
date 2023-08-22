class Niru{

public static void main(String args[]){

int array[] = {3,5,9,7,9,2,1};
int array1[] = {2,3,8,4,1,3,9};
int array2[] = {4,8,9,1,6,4,3};

sort(array);
sort(array1);
sort(array2);
}
public static void sort(int array[]){
for(int index=0;index<array.length;index++){

for(int otherindex=index+1;otherindex<array.length;otherindex++)

if(array[index] > array[otherindex]){

int temp = 0;
temp=array[index];
array[index]=array[otherindex];
array[otherindex]=temp;
//System.out.println(array[i]);
}

System.out.println(array[index]);
}

}
}
