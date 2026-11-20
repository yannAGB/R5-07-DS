public class Q5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage : java Q5 <N>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
