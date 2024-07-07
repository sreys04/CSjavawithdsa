//Abstract class & Interface

/*interface Shape{
    double pi =  3.14;  // public ,static,final}
    double getSquare(double r); //public and abstract
}
class Circle implements Shape{
    public double getSquare(double r){
        return r*r;
    }
    void fun(){
        System.out.println("Hey, I implemented an interface named Shape");
    }
}
public class InterfaceStudy{
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
}*/

///////////////////////////////////////////////////////////////
interface M{
    int x= 10;
    void fun();
}
interface N{
    int x = 20;
    void fun();
}
class C implements M,N{ //multiple inheritance in java
    public void fun(){
        System.out.println("Hello, I'm function in C");
        System.out.println(M.x);//ambiguity resolved using fully qualified name 
        System.out.println(N.x);//ambiguity resolved using fully qualified name
        System.out.println(M.super.hashCode());
        System.out.println(N.super.hashCode());
    }
}
interface O extends M,N{ //multiple inheritance through interfaces
    void fun();
}
class D implements O{ //multiple inheritance in java
    public void fun(){
        System.out.println("Hello, I'm function in D");
    }
}
   
public class MultipleInheritaceStudy{
    public static void main(String[] args){
        C c = new C();
        c.fun();
        D d = new D();
        d.fun();
    }
}
