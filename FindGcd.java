package BasicMathsForDSAQ;

public class FindGcd {
    // Calculate and return GCD of two given numbers x and y within range of integer
    int gcd(int x, int y) {
        while (x > 0 && y > 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        if (x == 0) {
            return y;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        FindGcd g1 = new FindGcd();
        System.out.println( g1.gcd(15, 12));
    }
}
