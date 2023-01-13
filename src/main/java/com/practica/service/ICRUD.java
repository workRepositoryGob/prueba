package com.practica.service;

import java.util.List;

public interface ICRUD<T,V>{
    T register(T t) throws Exception;
    T modify(T t)throws Exception;
    List<T> list()throws Exception;
    T listById(V v)throws Exception;
    void delete(V v)throws Exception;
}
