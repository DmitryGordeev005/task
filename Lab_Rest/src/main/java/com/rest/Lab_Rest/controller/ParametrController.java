package com.rest.Lab_Rest.controller;

import com.rest.Lab_Rest.model.Parametr;
import com.rest.Lab_Rest.service.ParametrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Parametr")
public class ParametrController {
    @Autowired
    ParametrService parametrService;

    @GetMapping("")
    public List<Parametr> list() {
        return parametrService.listAllParametr();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parametr> get(@PathVariable Integer idparametr) {
        try {
            Parametr parametr = parametrService.getParametr(idparametr);
            return new ResponseEntity<Parametr>(parametr, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Parametr>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Parametr parametr) {
        parametrService.saveParametr(parametr);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Parametr parametr, @PathVariable Integer idparametr) {
        try {
            Parametr existParametr = parametrService.getParametr(idparametr);
            parametr.setIdparametr(idparametr);
            parametrService.saveParametr(parametr);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer idparametr) {

        parametrService.deleteParametr(idparametr);
    }

}
