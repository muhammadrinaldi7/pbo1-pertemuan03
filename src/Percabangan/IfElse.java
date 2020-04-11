package Percabangan;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilai;
        String ket;
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
        if (nilai >= 90) {
            ket = "A";
        }else if (nilai >= 75) {
            ket = "B";
        }else {
            ket = "C";
        }
        System.out.println("===================");
        System.out.println("Total Nilai = "+nilai);
        System.out.println("Keterangan = "+ket);
    }
}
