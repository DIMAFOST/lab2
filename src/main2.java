public class main2 {
    public static void main(String[] args) {
        int n = 21;
        double f = n / 10; // перша цифра
        int s = n % 10; // друга цифра
        double sum = f + s;
        System.out.println("Сума цифр числа " + n + ": " + sum);
    }
}

