class p3{

    //write a function that computes the first 100 fibonacci numbers and prints them to the console
    public static void fibonacci(int n){
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        
        for(int i = 2; i < n; i++){
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
    public static void main(String args[]){
        
        fibonacci(10);
    }
}