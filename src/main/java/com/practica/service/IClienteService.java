package com.practica.service;

import com.practica.model.Cliente;

import java.util.Map;


public interface IClienteService extends ICRUD<Cliente,Integer>{

    public Map<String,Double> calculosEstadisticos();
}
