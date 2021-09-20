interface intrface{  
     void sum();  
}

class add1 implements intrface{  
     public void sum(){
          int a,b,c;
          a=2;
          b=4;
          c=a+b;
          System.out.println("\nThe sum of "+a+" and "+b+" is "+c+" \n");
     }  
}  

class add2 implements intrface{  
     public void sum(){
          int d,e,f;
          d=2;
          e=4;
          f=d+e;
          System.out.println("\nThe sum of "+d+" and "+e+" is "+f+" \n");
     }  
}

class check{  
     public static void main(String args[]){  
          intrface d = new add1();  
          d.sum();
          System.out.print("In java multiple inheritance is not supported, ");
          System.out.print("but we can use it with the help of Interfaces.\n");
          System.out.println("So this program is an example of Multiple Inheritance using Interfaces.");
     }
}
