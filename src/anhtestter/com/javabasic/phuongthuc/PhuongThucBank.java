package anhtestter.com.javabasic.phuongthuc;

import anhtestter.com.javabasic.kieudulieu.Bank;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.getInfo();
        double tongTien= (Bank.getInterestRate() * 100000000)/100;
        System.out.println("Tong tien lãi: " + tongTien);
    }
}
