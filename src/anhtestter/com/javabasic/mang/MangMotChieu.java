package anhtestter.com.javabasic.mang;

public class MangMotChieu {
    public static void main(String[] args) {

        //Khai báo mảng
        int songuyen[] = new int[20];

        //tHêm giá trị vào mảng
        songuyen[0] = 5;
        songuyen[1] = 10;
        songuyen[2] = 22;
        songuyen[4] = 25;

        songuyen[19]=88;

        //In giá trị trong mảng theo từng vị trí
        System.out.println(songuyen[0]);
        System.out.println(songuyen[1]);
        System.out.println(songuyen[2]);
        System.out.println(songuyen[3]);
        System.out.println(songuyen[4]);

        //Kiểm tra độ dài mảng
        System.out.println("Độ dài mảng à: " + songuyen.length);

        //Duyệt phần tử trong mảng với vòng lạp FOR
        for (int i = 0; i < songuyen.length; i++) {
            System.out.println(songuyen[i]);

        }

        //Thêm giá trị vào mảng thông qua vòng lặp For
        for (int i = 0; i < songuyen.length; i++) {
            if (i % 2 == 0) {
                songuyen[i] = 10;
            }
        }
        //=>nạp thêm thì truy xuất value ra
        for (int i = 0; i < songuyen.length; i++) {
            System.out.println(songuyen[i]);
        }

        //Gán giá trị cho mảng nặc danh
        int a[]={10, 20, 25, 55, 85};
        System.out.println(a.length);

        //mảng kiểu String
        String b[]= new String[3];
        b[0]= "selenium";
        System.out.println(b[0]);
    }
}
