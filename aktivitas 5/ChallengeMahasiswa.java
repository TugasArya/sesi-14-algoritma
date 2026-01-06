import java.util.Scanner;

public class ChallengeMahasiswa {
    public static void main(String[] args) {
        String[] nim = {"0045", "0208", "0088", "0004"};
        String[] nama = {"Arya", "Rizal", "Trivaldi", "Arbi"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String cari = input.nextLine();
        
        int posisi = -1;
        int perbandingan = 0;

        for (int i = 0; i < nama.length; i++) {
            perbandingan++;
            if (nama[i].equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }

        System.out.println("--------------------------------");
        if (posisi != -1) {
            System.out.println("Status: Ditemukan");
            System.out.println("NIM: " + nim[posisi]);
            System.out.println("Nama: " + nama[posisi]);
            System.out.println("Posisi Indeks: " + posisi);
        } else {
            System.out.println("Status: Tidak ditemukan");
        }
        System.out.println("Jumlah perbandingan pencarian: " + perbandingan);
        input.close();
    } 
}
