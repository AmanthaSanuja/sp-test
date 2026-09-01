
class p1 {

    static void sumUsingForLoop(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum using for loop: " + sum);
    }

    static void sumUsingWhileLoop(int[] a) {
        int sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        System.out.println("Sum using while loop: " + sum);
    }

    public static void main(String[] args) {
        // declaring and initializing an array
        int[] a = { 1, 2, 3, 4, 5 };

        sumUsingForLoop(a);
        sumUsingWhileLoop(a);

    }
}