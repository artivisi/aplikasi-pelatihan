package com.artivisi.aplikasi.pelatihan.controller;

import com.artivisi.aplikasi.pelatihan.dao.PesertaDao;
import com.artivisi.aplikasi.pelatihan.entity.Peserta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author fariz
 */
@RestController
@RequestMapping("/api/peserta")
public class PesertaController {
    
    @Autowired
    private PesertaDao pesertaDao;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello";
    }
    
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Iterable<Peserta> findAll() {
        return pesertaDao.findAll();
    }
}
