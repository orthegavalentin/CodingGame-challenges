public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        computerSums(4);
    }

    /**
     * 
     * Question number 1
     * 
     * We use a while loop inside two nested for loops
     * 
     * 
     * 
     */

    public static void computerSums(int n) {
        int temp = 0;

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                String res = "i=" + i;
                temp = i + j;
                if (i == n) {
                    System.out.println(res);
                    break;

                }

                while (temp <= n) {
                    res += "  " + j;
                    if (temp == n)
                        System.out.println(res);
                    temp += j;
                }

            }

        }

    }
}