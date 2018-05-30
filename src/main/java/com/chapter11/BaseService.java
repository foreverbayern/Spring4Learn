package com.chapter11;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:lucky date:2018/5/30
 * time:11:23
 */
public class BaseService<T> {

    @Autowired
    protected BaseRepository<T> repository;

    public void add() {
        System.out.println("add....");
        System.out.println(repository);
    }
}
