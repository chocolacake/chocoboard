package com.chocolacate.chocoboard.entity;

public enum DataSourceType {
    MYSQL(0, "Mysql"),
    MONGO(1, "Mongo"),
    KAFKA(2, "Kafka"),
    ;

    private final Integer code;
    private final String label;

    DataSourceType(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    public Integer getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
}

