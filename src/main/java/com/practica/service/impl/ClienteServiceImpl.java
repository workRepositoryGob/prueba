package com.practica.service.impl;


import com.practica.model.Cliente;
import com.practica.repo.IClienteRepo;
import com.practica.repo.IGenericRepo;
import com.practica.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClienteServiceImpl extends CRUDImpl<Cliente,Integer> implements IClienteService {

    @Autowired
    private IClienteRepo repo;
    @Override
    protected IGenericRepo<Cliente, Integer> getRepo() {
        return repo;
    }

    @Override
    public Map<String,Double> calculosEstadisticos() {
        Map<String,Double> map=new HashMap<>();
            List<Cliente>clientes=repo.findAll();
            if (clientes.size()>1){
                Double promedio= clientes
                        .stream()
                        .mapToDouble(Cliente::getEdad)
                        .average().orElse(0.0);

                Double sumatoria = clientes.stream().mapToDouble(Cliente::getEdad)
                        .reduce(.0, (i, v) -> i + (Math.pow(v-promedio,2)) );

                Double varianza=sumatoria/(clientes.size()-1);
                Double desviacion=Math.rint(Math.sqrt(varianza)*100)/100;

                map.put("Promedio",promedio);
                map.put("Varianza",varianza);
                map.put("Desviacion Standar",desviacion);
            }
          return map;
    }


}
