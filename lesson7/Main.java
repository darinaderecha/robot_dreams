public class Main {
    public static void main(String[] args) {
    }

    public static int exponent(int k){
        return (int) Math.pow(k,3);
    }

    public static void printSmth(int x){
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
    }

    public static void printSmth(char symbol, int x){
        for (int i = 0; i < x; i++) {
            System.out.print(symbol);

        }
    }
}
