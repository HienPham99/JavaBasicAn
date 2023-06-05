package anhtestter.com.javabasic.learcolection;

import java.util.*;

public class KhaiBao_SuDung {
    public static void main(String[] args) {

        //***
        //ArrayList:List: lưu được các giá trị trùng nhau-> cùng show theo thứ tu
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playwright");
        arrayList.add("Selenium");
        //Thêm phần tử vào ArrayList
        //index = 1: Thêm vào vị trí chỉ định
        arrayList.add(1, "Exten Report");

        //remove phần tử trong arrayList
        arrayList.remove("Selenium"); //remove theo text
        arrayList.remove(1);//remove theo vị trí (arr[1])

        //duyệt arrayList/lấy giá trị ra
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("========");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Playwright2");
        arrayList2.add("Cypress");

        //Add All arrayList2 vào arrayList1
        arrayList.addAll(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //tìm kiếm phần tử trong arrayList
        System.out.println("Tìm kiếm phần tử: " + arrayList.contains("Selenium"));

        //Chuyển ArrayList về dạng array
        Object[] mang= arrayList.toArray();
        for (int i = 0; i<mang.length; i++){
            System.out.println(mang[i]);
        }



        System.out.println("========");

        //***
        //Set:ko có thứ tự, không hiển thị các giá trị trùng nhau
        Set<String> stringSet = new HashSet<String>();
        //có thể viết theo TreeSet ~~HashSet
       // Set<String> stringSet = new TreeSet<String>();
        stringSet.add("Hien");
        stringSet.add("Cypress");
        stringSet.add("Hien");
        stringSet.add("akaAT");
        //Duyệt set/lấy ra
        for (String str : stringSet) {
            System.out.println(str);
        }
        System.out.println("========");

        //***
        //Map:Lưu theo dạng keyValue. ko theo index
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Company", "FPT Software");
        stringMap.put("address", "Hà Nội");
        stringMap.put("Email", "merkle@merkle.com");

        //duyệt Map/lấy ra
        System.out.println(stringMap.get("Company"));
        System.out.println(stringMap.get("address"));
        System.out.println(stringMap.get("Email"));

    }
}
