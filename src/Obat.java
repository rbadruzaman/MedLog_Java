
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Obat extends ProdukMedis{
    Date expireDate;

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    Obat(String nama, int stok, Date expireDate) {
        super(nama, stok);
        this.expireDate = expireDate;
    }

    @Override
    void tampilkanInformasi() {
        System.out.println("Obat-obatan: " + getNama() + ", Stok: " + getStok() + ", Expire Date: " + expireDate);
    }
}

