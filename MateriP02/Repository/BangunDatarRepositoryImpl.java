package REVIEW.MATERI.SEMESTER2.MateriP02.Repository;

public class BangunDatarRepositoryImpl implements BangunDatarRepository{

    @Override
    public double luasLingkaran(double d) {
        var luas = Math.PI * Math.pow((d/2),2);
        return luas;
    }
    @Override
    public double kelilingLingkaran(double d){
        var kel = Math.PI*d;
        return kel;
    }

    @Override
    public double luasSegitigaSiku2(double sisiMiring, double sisiTegak) {
        var powSisiMiring = Math.pow(sisiMiring,2);
        var powSisiTegak = Math.pow(sisiTegak,2);
        var sisiAlas = Math.sqrt((powSisiMiring- powSisiTegak));
        var luas = sisiAlas*sisiTegak/2;
        return luas;
    }

    @Override
    public double kelilingSegitigaSiku2(double sisiMiring, double sisiTegak) {
        var powSisiMiring = Math.pow(sisiMiring,2);
        var powSisiTegak = Math.pow(sisiTegak,2);
        var sisiAlas = Math.sqrt((powSisiMiring- powSisiTegak));
        var keliling = sisiMiring + sisiTegak + sisiAlas;
        return keliling;
    }

    @Override
    public double luasPersegi(double d) {
        var luas = Math.pow(d,2)/2;
        return luas;
    }

    @Override
    public double kelillingPersegi(double d) {
        var keliling = 4 * Math.sqrt((Math.pow(d,2)/2));
        return keliling;
    }

    @Override
    public double luasPersegiPanjang(double p, double l) {
        var luas = p * l;
        return luas;
    }

    @Override
    public double kelilingPersegiPanjang(double p, double l) {
        var keliling = 2 * (p+l);
        return keliling;
    }
}
