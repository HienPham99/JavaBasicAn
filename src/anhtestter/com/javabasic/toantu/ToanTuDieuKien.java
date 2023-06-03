package anhtestter.com.javabasic.toantu;

public class ToanTuDieuKien {
    public static void main(String[] args) {
       int a = 20;
       int b = 3;
        String expectedTex = "Selenium Java"; // data cứng từ file
        String actualTex = "Selenium Java123"; // kết quả lấy = auto với selenium
       String s = (expectedTex==actualTex)?"Test case Pass." :"Test case Fail";
        System.out.println(s);
    }
}
