package com.chocolacate.chocoboard.datasource.engine;

import com.chocolacate.chocoboard.datasource.core.MysqlDataSourceHolder;
import com.chocolacate.chocoboard.entity.DataSourceType;
import com.chocolacate.chocoboard.entity.datasource.mysql.MysqlDataSourceMetaData;
import com.chocolacate.chocoboard.entity.datasource.mysql.MysqlTableMetaData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MysqlEngine implements Engine {

    private MysqlDataSourceHolder mysqlDataSourceHolder;

    private MysqlEngine() {
        mysqlDataSourceHolder = new MysqlDataSourceHolder();
        log.info("Init Mysql Engine.");
    }

    public static MysqlEngine getInstance() {
        return MysqlEngineHolder.instance;
    }

    public MysqlDataSourceMetaData getDataSourceMetaData(String dataSourceName) {
        // checkAuth
//        mysqlDataSourceHolder.getDataSource(dataSourceName);
        return null;
    }

    public MysqlTableMetaData getTableMetaData(Long dataSourceId, String tableName) {
        return null;
    }


    @Override
    public DataSourceType getEngineType() {
        return DataSourceType.MYSQL;
    }

    private static class MysqlEngineHolder {
        private static final MysqlEngine instance = new MysqlEngine();
    }
}
