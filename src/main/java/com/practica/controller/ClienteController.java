package com.practica.controller;


import com.practica.model.Cliente;
import com.practica.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private IClienteService service;

    @GetMapping("/listclientes")
    public ResponseEntity<List<Cliente>> list() throws Exception {
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
    @PostMapping("/creacliente")
    public ResponseEntity<Cliente>insert(@RequestBody Cliente cliente) throws Exception {
        return new ResponseEntity<>(service.register(cliente),HttpStatus.CREATED);
    }

    @GetMapping("/kpideclientes")
    public ResponseEntity<Map<String,Double>> promedio() throws Exception {
        return new ResponseEntity<>(service.calculosEstadisticos(), HttpStatus.OK);
    }



}
