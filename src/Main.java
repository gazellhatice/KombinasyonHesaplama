//Java ile kombinasyon hesaplayan program yazınız.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, group, combination = 1, calculation = 1;
        System.out.print("Kümenin eleman sayısını giriniz: ");
        number = scan.nextInt();

        System.out.print("Kaç elemanlı farklı grup oluşturmak istediğinizi giriniz: ");
        group = scan.nextInt();

        int a = group;
        int grup = group;
        int sayi = number;

        for (;a >= 1; a--){
            combination *= number;
            number--;
        }

        int b = group;

        for (;b >= 1;b--){
            calculation *= group;
            group--;
        }

        System.out.println(sayi + "'ın " + grup + "'lı kombinasyonu: " + combination / calculation);
    }
}
