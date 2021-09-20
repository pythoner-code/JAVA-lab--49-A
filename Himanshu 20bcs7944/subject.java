public class subject{
     void course(){
          System.out.println("\nMy course is Computer Science and Engineering.\n");
     }
}

class stdnt extends subject{
     void core_subjects(){
          System.out.println("The core subjects are:");
          System.out.println("Programming for problem solving in C.");
          System.out.println("Object orientated programming using C++.");
          System.out.println("Data Base Management System.");
          System.out.println("Numerical Optimization and Techniques.");
          System.out.println("Java programming.");
     }
}

class fav_subject extends stdnt{
     void favourite(){
          System.out.println("\nI heared from my class mates that the java is very difficult to understand \nbut I do not found what they told me.\nNow, java is my favourite programming language.");
          System.out.println("\nThis is an example of Multilevel inheritance in java.");
     }
}

class statement{
     public static void main(String args[]){
          fav_subject obj1 = new fav_subject();
          obj1.course();
          obj1.core_subjects();
          obj1.favourite();
     }
} 
