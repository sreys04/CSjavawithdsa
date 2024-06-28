//CONSTRUCTORS


/*class loan{
    int rate;
    loan(){
        System.out.println("Hii, I'm default constructor of loan");
    }
    loan(int rate){
        this.rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
    }
}
class carLoan extends loan{
    int rate;
    carLoan(){
        System.out.println("Hii, I'm default constructor of carloan");
        System.out.println(super.rate);//1- using super access instance variable of parent class
    }
    carLoan(int rate){
        super(7);//3- to invoke the constructor of parent class(must be  1st line of child constructor)
        this.rate=rate;
    }
    void printRate(){
        System.out.println(this.rate);
        super.printRate();//2- using super to invoke methods of parent class
        System.out.println(super.rate);
    }
}
public class SuperStudy{
    public static void main(String[] args){
        carLoan cl = new carLoan(8);
        carLoan cl2 = new carLoan();
        cl.printRate();
    }
}*/

////////////////////////////////////////////////////////////

class A{
    final int noOfAlphabets = 26;//Final variables- value once assigned can not be changed
    final int noOfDigits;
    //either assign the values at time of declaration or assign inside constructors
    A(){
        noOfDigits = 10;
    }
    final void fun(){
        System.out.println("Hii, I'ma function in class A");
    }
}
final class B extends A{  //final classes cannot be inherited
    // void fun(){
    //     System.out.println("Hii, I'ma function in class B overriding function in A");
    // }
}
// class c extends B{
    
// }
public class FinalStudy{
    public static void main(String[] args){
        
    }
}
