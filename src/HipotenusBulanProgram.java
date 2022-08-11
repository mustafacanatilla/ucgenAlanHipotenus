import java.util.Scanner;
public class HipotenusBulanProgram {
    public static void main(String[] args) {

        double kenar1,kenar2, kenar3;

        Scanner sayi = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz:");
        kenar1 = sayi.nextDouble();
        System.out.print("2. Kenar Uzunluğunu Giriniz:");
        kenar2 = sayi.nextDouble();

        kenar3 = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.print("Hipotenüs:" +kenar3);

    }
}
