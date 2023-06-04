package anhtestter.com.javabasic.dieukien;

public class SwitchCase {
    public static void main(String[] args) {
        int number = 50;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("Không nằm trong 10,20,30 or 40.");
        }

        String OS = "Win";
        switch (OS) {
            case "Win" :
                System.out.println("Run test on platform Windows");
                break;
            case "Mac":
                System.out.println("Run test on platform MacOS");
                break;
            case "Linux":
                System.out.println("Run test on platform Linux");
                break;
            default:
                System.out.println("Run test on other.");
                  }
    }
}

