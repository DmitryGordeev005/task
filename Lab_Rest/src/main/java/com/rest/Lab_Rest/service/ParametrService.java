package com.rest.Lab_Rest.service;

import com.rest.Lab_Rest.model.Parametr;
import com.rest.Lab_Rest.repository.ParametrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParametrService {
    @Autowired
    private ParametrRepository parametrRepository;
    public List<Parametr> listAllParametr() {
        return parametrRepository.findAll();
    }

    public void saveParametr(Parametr parametr) {
        parametrRepository.save(parametr);
    }

    public Parametr getParametr(Integer idparametr) {
        return parametrRepository.findById(idparametr).get();
    }

    public void deleteParametr(Integer idparametr) {
        parametrRepository.deleteById(idparametr);
    }

}
