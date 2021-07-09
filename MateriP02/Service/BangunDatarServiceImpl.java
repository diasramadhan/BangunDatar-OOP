package REVIEW.MATERI.SEMESTER2.MateriP02.Service;

import REVIEW.MATERI.SEMESTER2.MateriP02.Repository.BangunDatarRepository;

public class BangunDatarServiceImpl implements BangunDatarService{
    BangunDatarRepository bangunDatarRepository;

    public BangunDatarServiceImpl(BangunDatarRepository bangunDatarRepository) {
        this.bangunDatarRepository = bangunDatarRepository;
    }

    @Override
    public void lingkaran(double d) {

        System.out.println("Luas     : " + bangunDatarRepository.luasLingkaran(d) );
        System.out.println("Keliling : " + bangunDatarRepository.kelilingLingkaran(d));
        System.out.println("=== SUKSES ===\n");
    }

    @Override
    public void segitiga(double sisiMiring, double sisiTegak) {
        System.out.println("Luas     : " + bangunDatarRepository.luasSegitigaSiku2(sisiMiring,sisiTegak) );
        System.out.println("Keliling : " + bangunDatarRepository.kelilingSegitigaSiku2(sisiMiring,sisiTegak));
        System.out.println("=== SUKSES ===\n");
    }

    @Override
    public void persegi(double d) {
        System.out.println("Luas     : " + bangunDatarRepository.luasPersegi(d));
        System.out.println("Keliling : " + bangunDatarRepository.kelillingPersegi(d));
    }

    @Override
    public void persegiPanjang(double p, double l) {
        System.out.println("Luas     : " + bangunDatarRepository.luasPersegiPanjang(p,l));
        System.out.println("Keliling : " + bangunDatarRepository.kelilingPersegiPanjang(p,l));
    }
}
