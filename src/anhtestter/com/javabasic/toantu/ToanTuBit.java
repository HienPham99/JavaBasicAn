package anhtestter.com.javabasic.toantu;

public class ToanTuBit {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean checkValue = (a>1) & (b>2);
        String expectedTex = "Selenium Java"; // data cứng từ file
        String actualTex = "Selenium Java"; // kết quả lấy = auto với selenium
        System.out.println(checkValue);
        System.out.println("Kết quả nhận được khi chạy auto so với mong muốn: " + (expectedTex == actualTex));
    }
}
