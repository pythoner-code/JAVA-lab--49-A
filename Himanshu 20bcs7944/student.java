public class student{
	void study(){
	     System.out.println("My name is Himanshu and my uid is 20bcs7944 \n");
	}
}
class teacher extends student{
	void teach(){
	     System.out.println("I am learning java from Sunil sir.\n");
	     System.out.println("This program is the example of single level inheritance.\n");
	}
}
class single_level{
	public static void main(String args[]){
	     teacher obj1 = new teacher();
	     obj1.study();
	     obj1.teach();
	     
	}
}
