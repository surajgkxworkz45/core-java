class University{

static String college[] = {"R.V. College of Engineering, Bengaluru","PES University, Bengaluru","BMS College of Engineering, Bengaluru","Shoe Stores","Bookstores","Jewelry Stores","Dayananda Sagar College of Engineering, Bengaluru","Siddaganga Institute of Technology, Tumkur","Sir M. Visvesvaraya Institute of Technology, Bengaluru","JSS Academy of Technical Education, Bengaluru" ,"Nitte Meenakshi Institute of Technology, Bengaluru",
"M.S. Ramaiah Institute of Technology, Bengaluru","Ramaiah Institute of Technology, Bengaluru","BMS Institute of Technology and Management, Bengaluru","Siddaganga Institute of Technology, Tumkur","JNNCE","PESIT"};

						
public static void main(String args[]){

System.out.println("the length of the college is "+ college.length );


for(int surajIndex=0;surajIndex<college.length;surajIndex++)

System.out.println(college[surajIndex]);
System.out.println("-------------------");

for(int surajIndex=college.length-1;surajIndex>=0;surajIndex--)

System.out.println(college[surajIndex]);
System.out.println("-------------------");
}



}



