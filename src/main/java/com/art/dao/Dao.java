package com.art.dao;

import com.art.entity.UserEntity;

/**
 * Created by user on 15.02.2017.
 */
public interface Dao<T> {
    void create(T t);
    T read(int id);
    void update(T t);
    void delete(T t);
}
