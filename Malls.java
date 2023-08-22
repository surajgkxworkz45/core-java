class Malls{

static String shopes[] = {"Clothing Stores","Electronics Stores","Department Stores","Shoe Stores","Bookstores","Jewelry Stores","Beauty and Cosmetics Stores","Home Goods Stores","Toy Stores","Sports and Outdoor Gear Stores" ,"Perfume Stores",
"Specialty Food Stores","Pet Stores","Music and Entertainment Stores","Mobile Phone and Accesseris"};

						
public static void main (String args[]){


/*System.out.println("the hotel food menu is  "  + shopes[0]+ "" +shopes[1]+ "" + shopes[2]+ "" 
+ shopes[3]+ "" +shopes[4]+ "" + shopes[5]+ "" + shopes[6]+ "" + shopes[7]+ "" + shopes[8]+ "" + shopes[9]+ "" + shopes[10]
+ "" + shopes[11]+ "" + shopes[12]+ "" + shopes[13]+ "" + shopes[14]);*/

System.out.println("the length of the shopes is "+ shopes.length );


for(int pIndex=0;pIndex<shopes.length;pIndex++)

System.out.println(shopes[pIndex]);
System.out.println("-------------------");

for(int pIndex=shopes.length-1;pIndex>=0;pIndex--)

System.out.println(shopes[pIndex]);
System.out.println("-------------------");
}



}


