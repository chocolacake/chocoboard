package com.chocolacate.chocoboard.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 7258645865561074435L;

    private Long id;
    private String userName;
    private String password;
    private Boolean isDelete;
    private Date lastModifyTime;
    private Date createTime;
}
