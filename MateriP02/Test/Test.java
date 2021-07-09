package REVIEW.MATERI.SEMESTER2.MateriP02.Test;

import REVIEW.MATERI.SEMESTER2.MateriP02.Repository.BangunDatarRepository;
import REVIEW.MATERI.SEMESTER2.MateriP02.Repository.BangunDatarRepositoryImpl;
import REVIEW.MATERI.SEMESTER2.MateriP02.Service.BangunDatarService;
import REVIEW.MATERI.SEMESTER2.MateriP02.Service.BangunDatarServiceImpl;
import REVIEW.MATERI.SEMESTER2.MateriP02.View.ViewBangunDatar;

public class Test {
    public static void main(String[] args) {
        testMenu();
    }

    public static void testMenu(){
        BangunDatarRepository bangunDatarRepository = new BangunDatarRepositoryImpl();
        BangunDatarService bangunDatarService = new BangunDatarServiceImpl(bangunDatarRepository);
        ViewBangunDatar bangunDatar = new ViewBangunDatar(bangunDatarService);
        bangunDatar.menuBangunDatar();
    }
}
