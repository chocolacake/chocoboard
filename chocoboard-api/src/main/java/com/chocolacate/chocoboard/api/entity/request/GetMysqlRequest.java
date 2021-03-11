package com.chocolacate.chocoboard.api.entity.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class GetMysqlRequest implements Serializable {
    private static final long serialVersionUID = -7458518810088693835L;

    private String dataSourceName;
}
