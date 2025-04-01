import java.util.*;
public class BinaryToDecimal {
    public static void bintodec(int binnum){
        int mynum = binnum;
        int pow = 0;
        int decnum=0;

        while(binnum>0){
            int lastDigit = binnum%10;
            decnum = decnum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binnum = binnum / 10;
        }
        System.out.println("Decimal of "+mynum+" is: "+decnum);

    }
    public static void main(String[] args) {
        bintodec(111);
        
    }
    
}
