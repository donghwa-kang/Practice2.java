public class App {
    public static void main(String[] args) throws Exception {
        int n = 5; // 피라미드의 높이

        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}