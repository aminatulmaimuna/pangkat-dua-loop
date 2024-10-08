import java.util.Scanner;

 public class PangkaatDuaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka; ");
        int angka = scanner.nextInt();

        int pangkat = 2;
        int hasil = 1;

        for (int i=0; i < angka; i++) {
            hasil *= pangkat;
        }
        System.out.println("Hasil dari " + angka + " pangkat 2 adalah " + hasil);
        scanner.close();
    }
 }