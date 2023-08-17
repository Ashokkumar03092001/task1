import java.util.Scanner;

interface calculator{
    public void power(double base,double exponent) throws Exception;
}
public class powercalculator implements calculator {
    public void power(double base,double exponent)throws Exception {
        try {
            double ans = 1;
            if (base < 0 || exponent < 0) {
                throw new Exception("Number is negative");
            } else {
                while (exponent > 0) {
                    ans = ans * base;
                    exponent--;
                }
                System.out.println((int) ans);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args)throws Exception {
        Scanner s = new Scanner(System.in);
        double base = s.nextDouble();
        double exponent = s.nextDouble();
        powercalculator obj = new powercalculator();
        obj.power(base,exponent);
        //System.out.println("Hello world!");
    }
}