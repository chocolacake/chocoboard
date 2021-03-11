package com.chocolacate.chocoboard.datasource.core;


import com.chocolacate.chocoboard.consts.DataSourceConst;
import com.chocolacate.chocoboard.datasource.entity.MysqlDataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Holder DataSource
 */
public class MysqlDataSourceHolder {

    private final Map<String, DataSource> dataSourceMap = new HashMap<>();

    public DataSource getDataSource(MysqlDataSource mysqlDataSource) {
        String dataSourceName = mysqlDataSource.getDataSourceName();
        if (!dataSourceMap.containsKey(dataSourceName)) {

            dataSourceMap.put(dataSourceName, createDataSource(mysqlDataSource));
        }
        return dataSourceMap.get(dataSourceName);
    }

    private DataSource createDataSource(MysqlDataSource mysqlDataSource) {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setAutoCommit(DataSourceConst.MysqlDataSourceConst.AUTO_COMMIT);
        hikariConfig.setDriverClassName(DataSourceConst.MysqlDataSourceConst.DRIVER_CLASS);
        hikariConfig.setConnectionTimeout(DataSourceConst.MysqlDataSourceConst.CONNECTION_TIMEOUT);
        hikariConfig.setMaximumPoolSize(DataSourceConst.MysqlDataSourceConst.MAX_POOL_SIZE);
        hikariConfig.setMinimumIdle(DataSourceConst.MysqlDataSourceConst.MINIMUM_IDLE);
        hikariConfig.setUsername(mysqlDataSource.getDataSourceUsername());
        hikariConfig.setPassword(mysqlDataSource.getDataSourcePassword());
        hikariConfig.setJdbcUrl(mysqlDataSource.getDataSourceUrl());

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }
}
