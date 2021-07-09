package REVIEW.MATERI.SEMESTER2.MateriP02.Repository;

public interface BangunDatarRepository {

    //luas dan keliling lingkaran
    double luasLingkaran(double d);
    double kelilingLingkaran(double d);

    //luas dan keliling segitiga siku-siku
    double luasSegitigaSiku2(double sisiMiring, double sisiTegak);
    double kelilingSegitigaSiku2(double sisiMiring, double sisiTegak);

    //luas dan keliling persegi
    double luasPersegi(double d);
    double kelillingPersegi(double d);

    //luas dan keliling persegi panjang
    double luasPersegiPanjang(double p,double l);
    double kelilingPersegiPanjang(double p,double l);

}
