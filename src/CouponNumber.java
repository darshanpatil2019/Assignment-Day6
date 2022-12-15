import java.util.Random;

public class CouponNumber {
    public static void main(String[] args) {
        CouponNumber couponNumber = new CouponNumber();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Coupon code : " + couponNumber.randomCouponNumber(10));
        }
    }

    public String randomCouponNumber(int couponCodeLength) {

        char[] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); //characters in coupon code
        String s = new String(); // for storing coupon code
        Random random = new Random(); //random function for Random code

        for (int i = 0; i < couponCodeLength; i++) {
            char c = chars[random.nextInt(chars.length)]; //for generate coupon code
            s = s + c;
        }
        return s;

    }
}
