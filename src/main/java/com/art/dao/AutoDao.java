package com.art.dao;

import com.art.entity.AutoEntity;

import java.util.List;

/**
 * Created by user on 20.02.2017.
 */
public interface AutoDao extends Dao<AutoEntity>{

    List<AutoEntity> getAllAutos();
}
