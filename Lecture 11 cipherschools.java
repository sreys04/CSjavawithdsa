//Static Variables & Abstract Class

abstract class Car{ //we cannot instantiate an abstract class - we can't create object of an abstract class
    int maxSpeed;
    abstract void accelerate(); //only declared but not implemented -it is without a body
    //they are created to force the child classes to implement them before using. we'll use them after overriding
    abstract void brake();
}
 abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}
class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying brakes");
    }
}
abstract class A{  //an abstrac5t class exist without abstract methods
//we simply mean we will not be able to create object of this class 
    int x= 10;
    void fun() //abstract class can have concrete methods
    {
        System.out.println("Hello, I'm A");
    }
}
public class AbstractStudy{
    public static void main(String[] args){
       // car c = new Car(); //can't instantiate an abstract class
        // BMW beemer = new BMW();
        // beemer.accelerate();
        BMW2 b = new BMW2();
        b.accelerate();
        b.brake();
    }
}
