class GoogleMaps{


static String roads[]={ "hosur road", "MG road", "KG road", "lalbhag road", "hosa road", "Vatal Nagaraj road",
"Danvathri road", "Palace road", "RG road", "IG road", "Dr Ambedkar road", "Dr Rajakumar road", "Mission road",
"langford road", "Marigowda Road", "outer ring road", "kothnur road", "Bannergatta main road",
"Mangal Road", "Magadi road","BM road", "kamaraj road", "St Johns road", "Tarapore Officer road", "Promenade road", "Assaye Road"};


 public static void main(String args[]){



/*System.out.println("the road is " + roads[0] + "" + roads[1]+ "" + roads[2]+ "" +roads[3]+ "" + roads[4]+ "" + roads[5]+ "" + 
roads[6]+ "" + roads[7]+"" + roads[8]+"" + roads[9]+ "" + roads[10]+ "" + 
roads[11]+ "" + roads[12]+ "" + roads[13]+ "" + roads[14]+ "" + roads[15]+ "" + 
roads[16]+ "" + roads[17]+ "" + roads[18]+ "" + roads[19]+ "" + roads[20]+ "" + roads[21]+ "" + roads[22]+ "" + roads[23]+ "" + roads[24]);*/


System.out.println("the length of the road is"+roads.length );

for(int mamindex=0;mamindex<roads.length;mamindex++){
	System.out.println(roads[mamindex]);
}
System.out.println("---------------------------------");
	for(int mamindex=roads.length-1;mamindex>=0;mamindex--){
	System.out.println(roads[mamindex]);
}
System.out.println("---------------------------------");

}
}