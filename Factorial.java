class Factorial{

public static void main(String args[]){
	iwantfact(5);
	iwantfact(7);
	iwantfact(8);
	iwantfact(9);
}

public static void iwantfact(int a){
	int dummy=1;
	for(int index=1;index<=a;index++){
		dummy=dummy*index;
	}
	System.out.println("the value is "+dummy);
}
}