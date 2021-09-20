import p4.accmod_pkg4;

class accmod_pkg5 extends accmod_pkg4{
     public static void main(String args[]){
          accmod_pkg5 obj = new accmod_pkg5();
          System.out.println("This is protected int a: "+obj.a);
          System.out.println("This is protected int b: "+obj.b);
     }
}
