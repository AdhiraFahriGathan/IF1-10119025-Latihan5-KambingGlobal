
package if1.pkg10119025.latihan5.kambingglobal;

public class KambingGlobal {

  //Variabel jumlah kambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
        }
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama & berjalan
          kambingSusu.getJumlahKambing();
          
        //Menambah satu kambing
          kambingSusu.tambahKambing();
          
        //Menampilkan jumlah kambing yang ada
          kambingSusu.getJumlahKambing();
    }
    
}
