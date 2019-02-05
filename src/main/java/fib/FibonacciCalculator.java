package fib;

public class FibonacciCalculator {

    //fibonacci(int n)
    public int getTerm(int n){
         if(n== 0 || n ==1){
             return n;
         }
        return getTerm(n-1)+ getTerm(n-2);
    }

}
