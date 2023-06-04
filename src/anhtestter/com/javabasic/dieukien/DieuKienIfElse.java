package anhtestter.com.javabasic.dieukien;

public class DieuKienIfElse {
    public static void main(String[] args) {
        //Điều kiện IF
        int age = 26;
        String name ="Auto";
        String message ="add category successfully";
        //Dùng hàm "equals": để so sánh bằng (không nên dùng dấu ==)
        //Dùng hàm "contain": để so sánh chứa
        if (age >=20 && (name.equals("Auto") ||message.contains("successfully"))) {
            System.out.println("Bạn đã trưởng thành và thành công.");
        }

        int number=18;
        if (number%2==0){
            System.out.println("Số "+ number + " là số chẵn.");
        }else {
            System.out.println("Số "+ number + " là số lẻ.");
        }
    }

}
