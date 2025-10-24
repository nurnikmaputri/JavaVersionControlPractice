import java.util.Scanner;
//modul 3
public class Main {

    // Fungsi utama program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("=====================================");
        System.out.println("   PROGRAM LATIHAN GIT & JAVA V1.0   ");
        System.out.println("=====================================");
        System.out.println("Halo, selamat datang di program sederhana!");
        System.out.println("Program ini dibuat untuk latihan Git dan Java.");
        System.out.println();

        // Perulangan menu utama
        while (running) {
            System.out.println("========= MENU PILIHAN =========");
            System.out.println("1. Tampilkan ucapan selamat");
            System.out.println("2. Hitung penjumlahan dua angka");
            System.out.println("3. Cek bilangan genap/ganjil");
            System.out.println("4. Keluar program");
            System.out.println("================================");
            System.out.print("Masukkan pilihan Anda (1-4): ");
            int pilihan = input.nextInt();
            System.out.println();

            // Percabangan untuk setiap menu
            switch (pilihan) {
                case 1:
                    tampilkanUcapan();
                    break;

                case 2:
                    hitungPenjumlahan(input);
                    break;

                case 3:
                    cekBilangan(input);
                    break;

                case 4:
                    System.out.println("Terima kasih sudah menggunakan program ini!");
                    System.out.println("Keluar dari program...");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.\n");
                    break;
            }
        }

        input.close();
    }

    // Fungsi menampilkan ucapan
    public static void tampilkanUcapan() {
        System.out.println("🎉 Selamat! Kamu berhasil menjalankan program ini dengan benar!");
        System.out.println("Semangat terus belajar Java dan Git!");
        System.out.println();
    }

    // Fungsi menghitung penjumlahan dua angka
    public static void hitungPenjumlahan(Scanner input) {
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        int hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil + "\n");
    }

    // Fungsi mengecek bilangan genap atau ganjil
    public static void cekBilangan(Scanner input