//polymorphism

class demo{
    void fun(){
        System.out.println("I have no Parameters");
    }
    void fun(int a){
        System.out.println("I have 1 Parameter A: " +a);
    }
    void fun(String s)
    {
        System.out.println("I have String s: " +s)
    }
    void fun(int a,int b){
        System.out.println("I have 2 Parameters A & B: " +a+", "+b);
    }
}
public class methodOverload{
    public static void main(String[] args){
        demo obj = new demo();
        obj.fun();
        obj.fun(5);
        obj.fun(10, 20);
        obj.fun("Hi There");
        
        System.out.println(5);
        System.out.println("abc");
        System.out.println(5.06);
        
    }
    
}
