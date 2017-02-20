package com.art.dao.impl;

import com.art.dao.AutoDao;
import com.art.entity.AutoEntity;
import com.art.utils.ConnectionPool;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.02.2017.
 */
public class AutoDaoImpl implements AutoDao {
    private Connection connection;

    public void create(AutoEntity autoEntity) {

    }

    public AutoEntity read(int id) {
        return null;
    }

    public void update(AutoEntity autoEntity) {

    }

    public void delete(AutoEntity autoEntity) {

    }

    public List<AutoEntity> getAllAutos() {
        List<AutoEntity> result = new ArrayList<AutoEntity>();
        try {
            connection = ConnectionPool.getInstance().getConnection();
            String query = "SELECT * FROM auto";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                AutoEntity autoEntity = new AutoEntity();
                autoEntity.setAutoId(resultSet.getInt("auto_id"));
                autoEntity.setAutoTitle(resultSet.getString("auto_title"));
                autoEntity.setDescription(resultSet.getString("auto_description"));
                autoEntity.setImageLink(resultSet.getString("image_link"));
                autoEntity.setUserId(resultSet.getInt("user_id"));
                result.add(autoEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

        return result;
    }
}
