package anhtestter.com.javabasic.kieudulieu;

public class Bank {
    static int VAT = 1000;
    static String BANKNAME = "Vietcombank";
    static String Address = "Ha noi";
    static String PHONE = "0987654321";
    static float INTEREST_RATE = 2.5f;
    public static void getInfo(){
        System.out.println("Bankname: " + BANKNAME);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + PHONE);
        System.out.println("Lãi suất: " + INTEREST_RATE);

    }
    public static double getInterestRate(){
        return INTEREST_RATE;

    }
}
