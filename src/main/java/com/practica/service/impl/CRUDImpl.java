package com.practica.service.impl;

import com.practica.repo.IGenericRepo;
import com.practica.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T,V> implements ICRUD<T,V> {

    protected abstract IGenericRepo<T,V> getRepo();
    @Override
    public T register(T t) throws Exception{
        return getRepo().save(t);
    }

    @Override
    public T modify(T t) throws Exception{
        return getRepo().save(t);
    }

    @Override
    public List<T> list() throws Exception{
        return getRepo().findAll();
    }

    @Override
    public T listById(V v)throws Exception {
        return getRepo().findById(v).orElse(null);
    }

    @Override
    public void delete(V v)throws Exception {
            getRepo().deleteById(v);
    }
}
