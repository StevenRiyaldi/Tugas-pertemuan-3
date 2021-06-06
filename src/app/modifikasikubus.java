package app;

import java.util.Scanner;

public class modifikasikubus {
    public static void main(String[] args) {
        float sisi;
        char yn = 'n';
        Scanner Input = new Scanner(System.in);
        do {
            System.out.println("Program Untuk Menghitung Luas dan Volume Kubus");
            System.out.println("Sisi ? ");
            sisi = Input.nextFloat();
            
            float Luas = 6 * (sisi*sisi);
            float Volume = sisi*sisi*sisi;

            System.out.println("Luas Permukaan kubus adalah : " + Luas);
            System.out.println("Volume kubus adalah : " + Volume);
            System.out.println("Apakah anda ingin mengulangi lagi ? [y/n] ");
            Input.nextLine();
            String yesno = Input.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');
        Input.close();
    }
}