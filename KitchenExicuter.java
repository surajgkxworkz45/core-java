class KitchenExicuter{


public static void main(String arg[]){

Kitchen kit=new Kitchen();
kit.setHotelName("sankalppa");
kit.setHotelLocation("rajajinager");
kit.setHotelOwner("surya");
kit.setHotelFamousDish("Biryani");
kit.setHotelNumberOfWorkers(55);

Hotel45 hol=new Hotel45();
hol.kitchen=kit;


hol.managedBy="surya";


System.out.println(hol.managedBy);

hol.eatingFood();
System.out.println(hol.kitchen.getHotelName());
System.out.println(hol.kitchen.getHotelLocation());
System.out.println(hol.kitchen.getHotelOwner());
System.out.println(hol.kitchen.getHotelFamousDish());
System.out.println(hol.kitchen.getHotelNumberOfWorkers());
}





}