package fibonacci;
import java.util.Scanner;
import java.util.LinkedList;
public class Fibonacci {
    static Scanner s = new Scanner (System.in);
    
    public static int recursivo(int n){
        if (n>=2){
            return recursivo(n-1)+recursivo(n-2);
        }
        else{
            return n;
        }
    }
    
    public static int iterativo(int n){
        LinkedList<Integer> fib = new LinkedList<Integer>();
        fib.add(0);
        fib.add(1);
        if(n<2){
            return fib.get(n);
        }
        for (int i = 2; i <= n; i++) {
            fib.add(fib.get(i-1)+fib.get(i-2));
        }
        return fib.get(n);
    }
    
    public static void main(String[] args) {
        System.out.print("Posicion de la suceción Fibonacci : ");
        int n = s.nextInt();
        System.out.println("Recursivo");
        System.out.println(recursivo(n));
        System.out.println("\nIterativo");
        System.out.println(iterativo(n));
    }
    
}
