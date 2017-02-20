package com.art.utils;

import org.apache.commons.dbcp.BasicDataSource;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by user on 15.02.2017.
 */
public class ConnectionPool {

    private static ConnectionPool connectionPool;
    private BasicDataSource dataSource;
    private Properties properties;
    private static final String FILE_PATH = "/path.properties";

    private ConnectionPool() throws IOException, SQLException, PropertyVetoException {
        properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_PATH);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName(properties.getProperty("db_driver_class"));
        dataSource.setUsername(properties.getProperty("db_login"));
        dataSource.setPassword(properties.getProperty("db_pass"));
        dataSource.setUrl(properties.getProperty("db_url"));
        dataSource.setMinIdle(15);
        dataSource.setMaxIdle(60);
        dataSource.setMaxOpenPreparedStatements(180);

    }

    public static ConnectionPool getInstance() throws IOException, SQLException, PropertyVetoException {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            return connectionPool;
        } else {
            return connectionPool;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

}
