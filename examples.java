import java.util.Scanner;

public class examples{
    public static void main(String[] args){
        /*  örnek 1 : iki sayının toplamı
        int n1=10,n2=15,result;
        result=n1+n2;
        System.out.println(n1+"+"+n2+"="+result);
        */

       /*örnek 2 : kullanıcının girdiği iki sayının toplamı
       Scanner oku = new Scanner(System.in);
       System.out.println("Lütfen birinci sayıyı giriniz:");
       int n1 = oku.nextInt();
       System.out.println("Lütfen ikinci sayıyı giriniz");
       int n2 = oku.nextInt();
       int result = n1+n2;
       System.out.println("Girilen iki sayının toplamı: " +result);
       */

       /*örnek 3 : ondalıklı iki sayının çarpımı
        float n1 = 3.5f, n2 = 6.2f;
        float result = n1 * n2;
        System.out.println("sonuc = "+result);
        */

       /*örnek 4 : Sayının kalanını ve bölümünü bulma
        int n1=30, bolen=5;
        int bolum = n1/bolen;
        int kalan=n1%bolen;
        System.out.println(bolum);
        System.out.println(kalan);
        */

        /*örnek 5 : kullanıcının girdiği yazılı puanını(0-100) nota dönüştürme(1-2-3-4-5) 
        Scanner oku = new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        int not = oku.nextInt();
        if(not<0 || not >100){
            System.out.println("Geçersiz not girdiniz");
        }else if(not>0 && not<=25){
            System.out.println("Notunuz 1 kaldınız");
        }else if(not>26 && not<=45){
            System.out.println("Notunuz 2 koşullu geçtiniz");
        }else if(not>46 && not<=55){
            System.out.println("Notunuz 3 Geçtiniz");
        }else if(not>56 && not<=75){
            System.out.println("Notunuz 4 iyi");
        }else if(not>76 && not<=100){
            System.out.println("Notunuz 5 pekiyi");
        }
        */

        /*örnek 6 : kullanıcının girdiği sayının pozitif, negatif veya sıfır mı sonucunu yazdıran program
        System.out.println("Bir sayı giriniz");
        Scanner oku = new Scanner(System.in);
        int n1 = oku.nextInt();
        if(n1==0){
            System.out.println("Sayı sıfırdır");
        }
        else if(n1>0){
            System.out.println("Sayı sıfırdan büyüktür");
        }
        else{
            System.out.println("Sayı sıfırdan küçüktür");
        }
        */

        /*örnek 7 : for döngüsü ile üs alma programı 
        int taban = 2, us = 4;
        long sonuc =1;
        for(; us!=0; --us){
            sonuc *=taban;
        }
        System.out.println("CEVAP = " +sonuc);
        */

        /*örnek 8 : 1'den 100'e kadar olan sayıların toplamını yapan program 
        int toplam = 0;
        for(int i=1; i<=100; i++){
            toplam=toplam+i;
        }
        System.out.println("Sonuc = "+toplam);
        */

        /*örnek 9 : Kullanıcının girdiği sayının basamakları toplamını bulan program
        
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n1 =oku.nextInt();
        int toplam = 0;
        int artis = 0;
        while (n1 !=0) {
           toplam = (n1%10) + toplam;
           n1 = n1/10;
           artis++;
        }
        System.out.println("Basamakları toplamı = "+toplam);
        */

        /*örnek 10 : klavyeden girilen sayının faktoriyelini hesaplama
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n1 = oku.nextInt();
        int toplam = 1;
        for(int i=1; i<=n1; i++){
            toplam = toplam * i;
        }
        System.out.println("Faktorıyel sonucunuz = "+toplam);
        */
    }
}