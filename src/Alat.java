
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Alat extends ProdukMedis{
    String jenis = "Alat";
    private String spesifikasi;

    public String getSpek() {
        return spesifikasi;
    }

    public void setSpek(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public Alat(String nama, int stok, String spesifikasi) {
        super(nama, stok);
        this.spesifikasi = spesifikasi;
    }
    
    @Override
    void tampilkanInformasi() {
        System.out.println("Alat Medis: " + getNama() + ", Stok: " + getStok() + ", Spesifikasi: " + spesifikasi);
    }
    
    public void insert_alat() throws SQLException{
        Database db = new Database();
        String sql = "INSERT into produkmedis values ('"+this.getNama()+"','"+this.getStok()+"','"+jenis+"','"+this.getSpek()+"')";
        db.query(sql);
    }
}
