class Fan{

static boolean isconnected;
static int currentvolume;
static int maxvolume=4;
static int minvolume;
public static boolean onOroff(){

if(isconnected==false){
isconnected=true;
System.out.println("turn on the Fan");
}
else if(isconnected==true){
isconnected=false;
System.out.println("turn off the Fan");


}

return isconnected;
}


public static void incresevolume(){

if(isconnected==true){
if(currentvolume < maxvolume){
	
	currentvolume=currentvolume+1;
	System.out.println("the Fan having a current volum is " + currentvolume);
	
}
	else{
		System.out.println("the Fan volume reached the maximum condition");
	}
	
}
else{
	System.out.println("surya first Fan on mado");
}
	

}

public static void decresevolume(){
	
	if(isconnected==true){
	if(currentvolume > minvolume){
		
		currentvolume=currentvolume-1;
		System.out.println("the Fan having a current volume is " +currentvolume);
		
		
	}
	
else{
	System.out.println("the Fan volume reached the minimum condition");
	}	
}
	else{
		System.out.println("surya loo first Fan on mado");
		
	}
	
}
}

