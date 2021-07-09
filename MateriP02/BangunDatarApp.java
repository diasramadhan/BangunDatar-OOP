package REVIEW.MATERI.SEMESTER2.MateriP02;

import REVIEW.MATERI.SEMESTER2.MateriP02.Repository.BangunDatarRepository;
import REVIEW.MATERI.SEMESTER2.MateriP02.Repository.BangunDatarRepositoryImpl;
import REVIEW.MATERI.SEMESTER2.MateriP02.Service.BangunDatarService;
import REVIEW.MATERI.SEMESTER2.MateriP02.Service.BangunDatarServiceImpl;
import REVIEW.MATERI.SEMESTER2.MateriP02.View.ViewBangunDatar;

import java.util.Scanner;

public class BangunDatarApp {
    public static void main(String[] args) {
        BangunDatarRepository bangunDatarRepository = new BangunDatarRepositoryImpl();
        BangunDatarService bangunDatarService = new BangunDatarServiceImpl(bangunDatarRepository);
        ViewBangunDatar bangunDatar = new ViewBangunDatar(bangunDatarService);
        bangunDatar.menuBangunDatar();
    }
}
