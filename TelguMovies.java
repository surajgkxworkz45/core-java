class TelguMovies{
public static void main (String[]  args){

int number[]={1,2,3,4};
String telgu[]={ "Ave Kallu"," Ave Kallu ","Drushyam", "D 16"};
double imdb[]={4.5,4.2,4.3,4.1};
		
		for(int index=0;index<telgu.length;index++){
		System.out.println(+ number[index] + " the movie is " + telgu[index] + "the rating of this film is " + imdb[index]);
		}
         
		for(int index=telgu.length-1;index>=0;index--){
		System.out.println(+ number[index] + " the movie is " + telgu[index] + "the rating of this film is " + imdb[index]);
		}
}


}