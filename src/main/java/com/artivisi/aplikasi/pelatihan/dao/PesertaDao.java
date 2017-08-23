package com.artivisi.aplikasi.pelatihan.dao;

import com.artivisi.aplikasi.pelatihan.entity.Peserta;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author fariz
 */
public interface PesertaDao extends PagingAndSortingRepository<Peserta, String> {

}
