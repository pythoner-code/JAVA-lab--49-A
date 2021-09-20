public class os{
     void defination(){
          System.out.println("\nHere OS is stands for operating system.\n");
     }
}

class window extends os{
     void microsoft(){
          System.out.println("The Window is an operating system provided by Microsoft.");
          System.out.println("The window users have less skill and they like to keep patience.");
     }
}

class kali_linux extends os{
     void open_source(){
          System.out.println("\nThe linux is a kernal not an operating system.");
          System.out.println("Linux users have skills and think outside the box mentality.");
          System.out.println("95% of servers all over the world are inux operated servers.");
          System.out.println("I like kali linux very much.");
          System.out.println("\nIn this program 2 subclasses extending single parent class,");
          System.out.println(" thus it is an example of Hierarchical Inheritance");
     }
}

class Debian{
     public static void main(String args[]){
          window obj1 = new window();
          obj1.defination();
          obj1.microsoft();
          kali_linux obj2 = new kali_linux();
          obj2.open_source();
     }
} 
