/**
 * task1
 */
public class task1 {

    public static String ConcatChar(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        char currentChar = c1;
        for (int i = 0; i < n; i++) {
            sb.append(currentChar);
            currentChar = (currentChar == c1) ? c2 : c1;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 10;
        char c1 = 'a';
        char c2 = 'b';
        String result = ConcatChar(n, c1, c2);
        System.out.println(result);
    }
}