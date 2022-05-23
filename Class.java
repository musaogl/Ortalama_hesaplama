import java.util.Scanner;
public class Class {
    public static void main(String[] args ) {
        int mat,tarih,muzik,fizik,turkce,kimye;
        int toplama;
        double ortalama;
        Scanner imput=new Scanner(System.in);
        System.out.print("Matmetik Notunuzu :");
        mat =imput.nextInt();
        System.out.print("Tarih Notunuz :");
        tarih = imput.nextInt();
        System.out.print("Kimye Notunuz :");
        kimye = imput.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik =imput.nextInt();
        System.out.print("Türkçe Notunuzu :");
        turkce =imput.nextInt();
        System.out.print("Müzik Notunuzu :");
        muzik =imput.nextInt();
        toplama =(mat+tarih+kimye+fizik+turkce+muzik);
        ortalama=toplama/6;
        System.out.println("Ortalamanız :"+ortalama);
        String sonuc = (ortalama>=60) ? "geçti" :"kaldı";
        System.out.print("Durumumuz :"+sonuc);





    }
}
