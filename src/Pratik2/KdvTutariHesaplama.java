package Pratik2;

import java.util.Scanner;
public class KdvTutariHesaplama {
    public static void main(String[] args) {

        double kdvsiz;
        Scanner input= new Scanner(System.in);

        System.out.print("Ürün Tutarı:");
        kdvsiz= input.nextInt();

        double kdv18=((kdvsiz/100)*18+kdvsiz);

        double kdv8=((kdvsiz/100)*8+kdvsiz);


        double kdvtutari1=kdv18-kdvsiz;
        double kdvtutari2=kdv8-kdvsiz;


        boolean kosul1 = kdvsiz>=0;
        boolean kosul2 = kdvsiz<=1000;
        boolean sonuc =kosul1&&kosul2;
        System.out.println("Kdv Tutarı:" +(sonuc? kdvtutari1:kdvtutari2));

    }
}
