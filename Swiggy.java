class Swiggy{

public static double search(String foodname,int quntity){
double price =0.0;

System.out.println("Invoke the search foodname (String),quntity(int)");
if(foodname=="biryani"){
	price = 220.00*quntity;
	return price ;
}
if(foodname=="pizza"){
   price = 110.00*quntity;
	return price ;
}
System.out.println("the end of search with 2 parameter");
 return price;
}

}



