class Bar{


static String alcohalBrands[]= {"Iichiko Shochu", "Royal Challenge", "Gordon’s Gin", "Hennessy", "Hlibny Dar Vodka", "Crown Royal Whisky",
" Aperol", "Baileys Irish Cream", " McDowell’s No. 1 Celebration Rum", "8PM Whisky", "Dr Ambedkar road", "Ballantine’s Scotch Whisky", "Khortytsa Vodka",
"Jägermeister", "Blender’s Pride Whisky", "Jameson Irish Whiskey", "Tito’s Handmade Vodka", "Bannergatta main road",
"Captain Morgan Rum", "Absolut Vodka","Jack Daniel’s Whiskey", " Bacardi Rum", "Emperador Brandy", "Smirnoff Vodka", "Jinro Soju", "Ginebra San Miguel Gin","McDowell’s No.1 Whisky",
"Tanduay Rum","Royal Stag Whisky","Officer’s Choice Whisky"," Imperial Blue Whisky"};


public static void main(String args[]){



/*System.out.println("the alcohal Brands is " + alcohalBrands[0] + "" + alcohalBrands[1]+ "" + alcohalBrands[2]+ "" +alcohalBrands[3]+ "" + alcohalBrands[4]+ "" + alcohalBrands[5]+ "" + 
alcohalBrands[6]+ "" + alcohalBrands[7]+"" + alcohalBrands[8]+"" + alcohalBrands[9]+ "" + alcohalBrands[10]+ "" + 
alcohalBrands[11]+ "" + alcohalBrands[12]+ "" + alcohalBrands[13]+ "" + alcohalBrands[14]+ "" + alcohalBrands[15]+ "" + 
alcohalBrands[16]+ "" + alcohalBrands[17]+ "" + alcohalBrands[18]+ "" + alcohalBrands[19]+ "" + alcohalBrands[20]+ "" + alcohalBrands[21]+ "" + alcohalBrands[22]+ "" + alcohalBrands[23]+ "" + alcohalBrands[24]
+ "" + alcohalBrands[25]+ "" + alcohalBrands[26]+ "" + alcohalBrands[27]+ "" + alcohalBrands[28]+ "" + alcohalBrands[29]);*/

System.out.println("the length of the alcohal brandes is"+alcohalBrands.length );

for(int mamindex=0;mamindex<alcohalBrands.length;mamindex++){
	System.out.println(alcohalBrands[mamindex]);
}
System.out.println("---------------------------------");
	for(int mamindex=alcohalBrands.length-1;mamindex>=0;mamindex--){
	System.out.println(alcohalBrands[mamindex]);
}
System.out.println("---------------------------------");

}
}