package anhtestter.com.javabasic.dieukien;

public class DieuKienIfElseIf {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        String name = "FPT";
        if (number1 > 30) {
            System.out.println("Thỏa mãn điều kiện 1");
        } else if (number1 >= 20) {
            System.out.println("Thỏa điều kiện 2.");
        } else if (number1 >= 5) {
            System.out.println("Thỏa mãn điều kiện 3.");
        } else {
            System.out.println("Không thỏa mãn điều kiện nào cả.");
        }

        int diemTB = 10;
        if (diemTB >=8){
            System.out.println("Học sinh giỏi.");
        } else if (diemTB >=7) {
            System.out.println("Học sinh khá.");
        } else if (diemTB >=5 && diemTB <7) {
            System.out.println("Học sinh trung bình");
             }
        else {
            System.out.println("Học sinh yếu.");
        }

    }
}
