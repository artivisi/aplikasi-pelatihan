package com.artivisi.aplikasi.pelatihan.dao;

import com.artivisi.aplikasi.pelatihan.entity.Peserta;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author fariz
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PesertaDaoTest {
    
    @Autowired
    private PesertaDao pesertaDao;
    
    @Autowired
    private DataSource ds;
    
    @Test
    public void testInsert() throws SQLException {
        Peserta p = new Peserta();
        p.setNama("Peserta 001");
        p.setEmail("peserta001@gmail.com");
        p.setTanggalLahir(new Date());
        
        pesertaDao.save(p);
        
//        String sql = "select count(*) as jumlah where email = 'peserta001@gmail.com'";
//        
//        try (Connection c = (Connection) ds.getConnection()) {
//            ResultSet rs = c.createStatement().executeQuery(sql);
//            Assert.assertTrue(rs.next());
//            
//            Long jumlahRow = rs.getLong("jumlah");
//            Assert.assertEquals(1L, jumlahRow.longValue());
//        }
    }
    
    @After
    public void testFindAll() {
        List<Peserta> daftarPeserta = (List<Peserta>) pesertaDao.findAll();
        daftarPeserta.stream().forEach((p) -> {
            System.out.println("==== TEST FIND ALL ====");
            System.out.println("==== NAMA : " + p.getNama() + " ====");
            System.out.println("==== EMAIL : " + p.getEmail()+ " ====");
            System.out.println("==== TANGGAL LAHIR : " + p.getTanggalLahir()+ " ====");
        });
    }
}
