public class Jurusan extends Mahasiswa {
    private String namaJurusan = "Ilmu Komputer";
    
    public void info() {
        super.info(); 
        System.out.println("Jurusan: " + namaJurusan);
    }
}
