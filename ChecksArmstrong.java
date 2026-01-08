package BasicMathsForDSAQ;

public class ChecksArmstrong {
    void armstrong(int n){
        int sum = 0;
        int dup = n;
        while (n>0){
            int ld = n%10;
            sum = sum + (ld*ld*ld);
            n = n/10;
        }
        if (sum == dup){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        ChecksArmstrong c1 = new ChecksArmstrong();
        c1.armstrong(371);
    }
}
