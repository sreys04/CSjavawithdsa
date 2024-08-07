
public class Fibnacci{
    static int fib(int n)//recusive apparoach
    {
        if(n<2)return n;
        return fib(n-1)+fib(n-2);
    }
    static int fibM(int n,int storage[])//approach
    {
        if(n<2)return n;
        if(storage[n]!=0)return storage[n];//step3 ->return values from array if already calculated
        storage[n] = fibM(n-1),storage)*fibM(n-2,storage);//step 2 ->store in the array
        return storage[n];
    }
    static int fibT(int n){
        int storage[] = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2;i<n;i++){
            storage[i] = storage[i-1]+storage[i-2];
        }
        //array filled completely
        return storage[n];
    }
    public static void main(String args[]){
        int n=7;
        long start =System.currentTimeMillis();
        System.out.println(fib(n));
        long end = System.currentTimeMillis();
        System.out.println(n);
        int storage[] = new int[n+1];
        System.out.println(n,storage);
        end = System.currentTimeMillis();
        System.out.println("time by second approach"+(end-start));


        start = System.currentTimeMillis();
        System.out.println(fibM(n,storage));
        end = System.currentTimeMillis();
        System.out.println("time by memenization" + (end-start));
    }
}
