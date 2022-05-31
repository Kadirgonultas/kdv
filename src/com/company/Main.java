package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


    double kdvliFiyat,kdvOrani,kdvsiz,kdvTutar;

        System.out.print("KDV'siz Fiyat : ");
        kdvsiz = input.nextInt();

        kdvOrani = (kdvsiz > 0 && kdvsiz < 1000) ? 0.18 : 0.08;

        kdvTutar = kdvsiz * kdvOrani;
        kdvliFiyat = kdvsiz + kdvTutar;

        System.out.print("KDV'li Tutarı : " + kdvliFiyat);










    }
}
