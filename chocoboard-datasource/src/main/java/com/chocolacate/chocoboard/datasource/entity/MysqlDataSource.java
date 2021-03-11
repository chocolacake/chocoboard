package com.chocolacate.chocoboard.datasource.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MysqlDataSource implements Serializable {

    private static final long serialVersionUID = -7078634463392679474L;

    private String dataSourceName;

    private String dataSourceUrl;

    private String dataSourceUsername;

    private String dataSourcePassword;
}
