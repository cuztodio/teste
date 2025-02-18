public class Main {
    public static void main(String[] args) {
        int resultado = soma(2, 3);
        int resultado2 = sub(5, 4);
        System.out.printf("%d, %d", resultado, resultado2);
    }
    public static int soma(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
}