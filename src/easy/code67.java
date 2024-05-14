package easy;

public class code67 {
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }


            ans.append(sum % 2);
            ca = sum / 2;
        }
        if (ca == 1) {
            ans.append(ca);
        }

        return ans.reverse().toString();


    }
    public static void main(String[] args) {
    }
}
