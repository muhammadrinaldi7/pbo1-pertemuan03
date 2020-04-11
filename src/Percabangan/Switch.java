package Percabangan;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nilai;
        System.out.print("Berikan Nilai Untuk Tugas Saya : ");
        nilai = input.nextLine();
        switch (nilai){
            case "A" :
                System.out.println("Mantap bagus, lanjutkan!!");
                break;
            case "B" :
                System.out.println("Keren-keren, tambahi lagi!!");
                break;
            case "C" :
                System.out.println("Lumayan lah, Kembangkan yaa!!");
                break;
            case "D" :
                System.out.println("Coba belajar lagi lah!");
                break;
            case "E" :
                System.out.println("Mending balik ke semester 1! 0-0");
                break;
            default:
                System.out.println("Sampai E aja pak ai :D");
                break;
        }
    }
}
