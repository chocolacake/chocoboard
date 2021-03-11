package com.chocolacate.chocoboard.consts;

public class DataSourceConst {


    public static class MysqlDataSourceConst {
        public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
        public static final Boolean AUTO_COMMIT = true;
        public static final Long CONNECTION_TIMEOUT = 3000L;
        public static final Integer MAX_POOL_SIZE = 30;
        public static final Integer MINIMUM_IDLE = 5;

    }
}
