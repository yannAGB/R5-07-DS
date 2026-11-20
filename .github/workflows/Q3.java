public class Q3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage : java Q3 <N>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        for (int i = n; i >= 1; i--) {
            System.out.print(i + (i > 1 ? " " : ""));
        }
        System.out.println();
    }
}
