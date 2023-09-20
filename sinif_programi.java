// kullanıcı girişi için kütüphane tanımı
import java.util.Scanner;
public class sinif_programi {
    public static void main(String[] args) {
        // verilerin saklanması için int türündeki veri tipi kullanımı
        int mat , fizik, kimya,turkce,muzik;
        Scanner giris = new Scanner(System.in);
        // kullanıcıdan veri alma 
        System.out.print("MATEMATİK NOTUNUZU GİRİNİZ : ");
        mat = giris.nextInt();
        System.out.print("FİZİK NOTUNUZU GİRİNİZ : ");
        fizik = giris.nextInt();
        System.out.print(" KİMYA NOTUNUZU GİRİNİZ : ");
        kimya = giris.nextInt();
        System.out.print("TÜRKÇE NOTUNUZU GİRİNİZ : ");
        turkce = giris.nextInt();
        System.out.print("MÜZİK NOTUNUZU GİRİNİZ : ");
        muzik = giris.nextInt();
        // operatörle ile hesaplama 
        double ort = ( mat + fizik + kimya + turkce + muzik ) /5;
        // koşul ifadeşer ile ortalamanın doğruluğu. 
        if(ort <= 55){
            System.out.println("Sınıfta kaldınız.");
            System.out.print( ort);
        }
        else{
            System.out.println("Sınıfı Başarı İle Tamamladınız. Tebrikler.");
            System.out.print(ort);
        }

    }
}
