import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,age,select;
        System.out.print("Mesafeyi Km Cinsinden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();
        System.out.println("1-Tekyön\n2-Gidiş Dönüş");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();
        if (km <= 0 || age <= 0 || (select != 1 && select != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double perKm = km * 0.10;
        if (age<12){
           perKm*= 0.5;
        } else if ((age>12) && (age<24) ) {
             perKm*= 0.9 ;
        } else if (age > 65 ) {
             perKm*=0.7;
        } else {
            perKm = perKm;
        }

        switch (select){
            case 1:
                System.out.println("Toplam Tutar: " +perKm);
             break;
            case 2:
                double total = ((perKm*8)/10)*2;
             System.out.println("Toplam tutar: "+total);
        }
        
    }
}
