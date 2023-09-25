class ApplicationExicuter{


public static void main(String args[]){


Application app=new Application();

app.setName("pubg");
app.setSizeInMb("1.89gb");
app.setVersion("v-22");
app.setNoOfDownloads("100M");
app.setCompanyName("PUBG Corporation");

PlayStore stor=new PlayStore();
stor.application=app;
stor.managedBy="Google";


System.out.println(stor.managedBy);
stor.downloadApps();

System.out.println(stor.application.getName());
System.out.println(stor.application.getName());
System.out.println(stor.application.getSizeInMb());
System.out.println(stor.application.getVersion());
System.out.println(stor.application.getNoOfDownloads());
System.out.println(stor.application.getCompanyName());

}




}