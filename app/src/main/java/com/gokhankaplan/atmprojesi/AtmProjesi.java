package com.gokhankaplan.atmprojesi;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        String UserName, Password;
        Scanner input = new Scanner(System.in);

        int bakiye = 1500, tutar, number, right = 3;

        while (right>0) {
            System.out.println("UserName: ");
            UserName = input.next();
            System.out.println("Password: ");
            Password = input.next();
            if (UserName.equals("gokhan") && Password.equals("123"))
            {
                System.out.println("Hoşgeldiniz Gökhan Bey.");
                System.out.println("Lütfen işlem giriniz.\n" +
                        "1-Para yatırma\n" +
                        "2-Para çekme\n" +
                        "3-Bakiye sorgu\n" +
                        "4-Çıkış");
                number = input.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("Tutar giriniz: ");
                        tutar = input.nextInt();
                        bakiye += tutar;
                        break;
                    case 2:
                        System.out.println("Tutar giriniz: ");
                        tutar = input.nextInt();
                        if(tutar<bakiye){
                            bakiye -= tutar;
                        }
                        else {
                            System.out.println("Geçersiz işlem!");
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + bakiye);
                        break;
                    default:
                        System.out.println("Hoşçakalın.");
                }

            }
            else
            {
                --right;
                System.out.println("Hakkınız kaldı: " + right);
            }
        }
        System.out.println("Hakkınız bitti. Lütfen bizimle iletişime geçin.");




    }
}
