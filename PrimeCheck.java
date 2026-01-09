package BasicMathsForDSAQ;

public class PrimeCheck {
    void print(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                if ((n / i) != i) {
                    cnt++;
                }
            }
        }
        if (cnt == 2) {
            System.out.println("is a prime number");
        } else {
            System.out.println("not a prime number");
        }
    }

    public static void main(String[] args) {
        PrimeCheck p1 = new PrimeCheck();
        p1.print(37);
    }
}
