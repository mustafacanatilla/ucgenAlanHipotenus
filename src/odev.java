import java.util.Scanner;

public class odev {
    public static void main(String[] args) {

        double kenar1,kenar2, kenar3, x, alan, cevre;

        Scanner sayi = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz:");
        kenar1 = sayi.nextDouble();
        System.out.print("2. Kenar Uzunluğunu Giriniz:");
        kenar2 = sayi.nextDouble();
        System.out.print("3. Kenar Uzunluğunu Giriniz:");
        kenar3 = sayi.nextDouble();

        x = (kenar1 + kenar2 + kenar3) / 2;
        cevre = (2*x);

        alan = Math.sqrt((x*((x-kenar1)*(x-kenar2)*(x-kenar3))));
        System.out.print("Üçgenin Alanı:" +alan);


    }
}
