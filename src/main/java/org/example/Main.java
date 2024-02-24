package org.example;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String nama;
        String jk;
        String humur;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukan nama Anda: ");
        nama = objInput.nextLine();
        System.out.print("Masukan Jenis Kelamin (L/P) : ");
        jk = objInput.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        humur = objInput.nextLine();


        System.out.println("Nama :" + nama);
        switch (jk) {
            case "L":
                System.out.println("Jenis Kelamin : Laki-Laki ");
                break;
            case "P":
                System.out.println("Jenis Kelamin : Perempuan");
                break;
            default:
                System.out.println("Error-Tolong masukan sesuai format diatas");
        }

        LocalDate Tlahir = LocalDate.parse(humur);
        LocalDate Hini = LocalDate.now();

        Period hitung = Period.between(Tlahir, Hini);
        int humur1 = hitung.getYears();

        System.out.println("Umur Anda : " + humur1 + " tahun");

    }
}