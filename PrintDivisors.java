package BasicMathsForDSAQ;

public class PrintDivisors {
    void print(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        PrintDivisors p1 = new PrintDivisors();
        p1.print(36);
    }
}
