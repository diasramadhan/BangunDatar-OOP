package REVIEW.MATERI.SEMESTER2.MateriP02.View;

import REVIEW.MATERI.SEMESTER2.MateriP02.Service.BangunDatarService;
import REVIEW.MATERI.SEMESTER2.MateriP02.Util.InputUtil;

import java.util.Scanner;

public class ViewBangunDatar {
    BangunDatarService bangunDatarService;

    public ViewBangunDatar(BangunDatarService bangunDatarService) {
        this.bangunDatarService = bangunDatarService;
    }

    //menampilkan view bangun datar
    public void menuBangunDatar(){
        boolean ulang = true;
        while (ulang) {
            Scanner scanner = new Scanner(System.in);

            //menampilkan menu
            System.out.println("==== Menu ===");
            System.out.println("1. Lingkaran ");
            System.out.println("2. Segitiga ");
            System.out.println("3. Persegi ");
            System.out.println("4. Persegi Panjang ");
            System.out.println("x. Keluar");
            //input user
            var menu = InputUtil.input("Pilih");


            switch (menu) {
                case "1" -> {
                    viewLingkaran();
                }
                case "2" -> {
                    viewSegitiga();
                }
                case "3" -> {
                    viewpersegi();
                }
                case "4" -> {
                    viewPersegiPanjang();
                }
                case "x", "X" -> {
                    return;
                }
                default -> System.out.println("pilihan ( " + menu + " ) tidak ada !!");
            }
        }
    }

    //view lingkaran
    public void viewLingkaran(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("==== lingkaran ====");
        System.out.print("Diameter : ");
        var d = scanner.nextInt();

        bangunDatarService.lingkaran(d);
        System.out.println();
    }

    //view segitiga
    public void viewSegitiga(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("==== Segitiga ====");
        System.out.print("sisi miring : ");
        var m = scanner.nextDouble();
        System.out.print("sisi tegak  : ");
        var t = scanner.nextDouble();

        bangunDatarService.segitiga(m,t);
        System.out.println();
    }

    //view persegi
    public void viewpersegi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("==== Persegi ====");
        System.out.print("Panjang diagonal : ");
        var diagonal = scanner.nextDouble();

        bangunDatarService.persegi(diagonal);
        System.out.println();
    }

    //view persegi panjang
    public void viewPersegiPanjang(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("==== Persegi Panjang ====");
        System.out.print("Panjang : ");
        var panjang = scanner.nextDouble();
        System.out.print("Lebar   : ");
        var lebar = scanner.nextDouble();

        bangunDatarService.persegiPanjang(panjang,lebar);
        System.out.println();
    }

}
