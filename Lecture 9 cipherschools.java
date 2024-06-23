//implementation of objects and inheritance

//inheritance

class Shape{   //parent or base or super class
    double pi = 3.14;
    double getSquare(int r){
        return r*r;
    }
}
class Circle extends Shape{   //child class,derived or sub class
    void area(int r){
        System.out.println(pi*getSquare(r));
    }
}
public class InheritanceStudy{
    public static void main(String[] args){
        Circle c=new Circle();
        c.area(5);
    }
}
