import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int bil2 = input.nextInt();

        System.out.print("Pilih operasi (+ - * /): ");
        char operator = input.next().charAt(0);

        int hasil;

        if(operator == '+') {
            hasil = bil1 + bil2;
        } else if(operator == '-') {
            hasil = bil1 - bil2;
        } else if(operator == '*') {
            hasil = bil1 * bil2;
        } else if(operator == '/') {
            hasil = bil1 / bil2;
        } else {
            System.out.println("Operator yang kau masukkan salah!");
            return;
        }

        System.out.println("Hasilnya adalah: " + hasil);

    }

}
