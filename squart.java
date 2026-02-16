class Squart {

    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false;

        double sqrt = Math.sqrt(n);
        int x = (int) sqrt;

        return (x * x == n);
    }

    public static void main(String[] args) {
        int n = 30;

        if (isPerfectSquare(n)) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}
