class SwiggyExicuter{

public static void main(String args[]){

double price= Swiggy.search("biryani",3);
System.out.println("the price of 3 biryani is " +price);

 price= Swiggy.search("pizza",5);
System.out.println("the price of 3 pizza is " + price);

}



}