package anhtestter.com.javabasic.variables;

public class LearnVariables {
    static int age = 25; //biến toàn cục
    static int number= 20;

    public static void sayHello(){
        int n = 10; //Biến cục bộ  (local)
        System.out.println("Giá trị của n là: " + n);
        System.out.println(number);

    }
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(number);

        //Cách 1:
        LearnVariables abc = new LearnVariables();
        abc.sayHello();

        //Cách 2:
        sayHello();

    }
}
