//Access Modifiers

/*public class A
{
int x= 10;
private int y = 15;
public int z= 20;
protected int w= 25;

public static void main (String[] args)
{
A obj=new A();
System.out.println(obj.x);
System.out.println(obj.y);
System.out.println(obj.z);
System.out.println(obj.w); 
}
}*/


///////////////////////////////////////////////////////////////////////
/*
public class B
{
public static void main (String[] args)
{
A obj=new A();
System.out.println(obj.x); 
System.out.println(obj.y); //private not accessible outside the class
System.out.println(obj.z); //public is accessible everywhere outside the class
System.out.println(Obj.w); //protected will be visible in different package in subclass using object 
}
}
*/
/////////////////////////////////////////////////////////

/*
public class C extends A{
public static void main (String[] args)
{
A obj=new A();
C childObj = new C();
// System.out.println(childObj.x);
// System.out.println(childObj.y);//private not accessible outside the class 
System.out.println(obj.z);
System.out.println(Obj.w); //protected will be visible in different package in subclass using object 

}
}*/

//////////////////////////////////////////////////////////

/*
public class D
{
public static void main (String[] args)
{
A obj=new A();
System.out.println(obj.x);
System.out.println(obj.y);
System.out.println(obj.z);
System.out.println(obj.w); //protected will not be accessible outside package in non-subclass
}
}*/

//Encapsulation//

class A{
    private int a=10;
    private int b=10;
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public void setA(int a){
        this.a=a;
    }

}
public class EncapStudy {

    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.getA()+" "+a1.getB());
        a1.setA(23);
        System.out.println(a1.getA());
    }
}
