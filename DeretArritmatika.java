import java.util.Scanner;

public class DeretArritmatika {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan batas awal: ");
        int batasAwal = s.nextInt();
        System.out.println("Masukkan batas akhir: ");
        int batasAkhir = s.nextInt();
        System.out.println("Masukkan kelipatan: ");
        int Kelipatan = s.nextInt();

        System.out.println("Deret Aritmatika: ");
        for (int i = batasAwal; i <=batasAkhir; i += Kelipatan) {
        }

        int j = batasAwal;
        System.out.println();
        while (j <= batasAkhir) {
            System.out.print(j + ",");
            j += Kelipatan;
        }
        System.out.println();

        s.close();
    }
}
