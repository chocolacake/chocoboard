package com.chocolacate.chocoboard.entity.datasource.mysql;

import java.io.Serializable;
import java.util.List;

public class MysqlDataSourceMetaData implements Serializable {
    private static final long serialVersionUID = -612215210026145369L;

    private String datasourceName;

    private Long memorySize;

    private List<MysqlTableMetaData> mysqlTableMetaDatas;

    // todo:

}
