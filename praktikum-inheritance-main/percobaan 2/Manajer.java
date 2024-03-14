public class Manajer extends Pegawai {
    public String departemen;
    
    public void isiData(String n, String d) {
        // Menggunakan setter untuk mengatur nilai nama
        setNama(n);
        departemen = d;
    }
}
