package BasicMathsForDSAQ;

import static java.lang.Math.sqrt;

public class PrintDivisors {
    void print(int n){
//        for (int i = 1; i <= n; i++) {
//            if (n%i==0){
//                System.out.println(i);
//            }
//        }
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n%i == 0){
                System.out.println(i);
                if (n/i != i){
                    System.out.println(n/i);
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintDivisors p1 = new PrintDivisors();
        p1.print(36);
    }
}

//you can sort this and store this using LinkedList DS
