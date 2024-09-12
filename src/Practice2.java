import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 메시지 출력
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 입력된 이름 출력
        System.out.println("안녕하세요, " + name + "님. This is JAVA");

        // Scanner 객체 닫기
        scanner.close();
    }
}
