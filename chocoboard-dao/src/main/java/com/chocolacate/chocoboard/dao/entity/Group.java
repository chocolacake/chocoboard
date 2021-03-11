package com.chocolacate.chocoboard.dao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Group {
    private Integer id;
    private String groupName;
    private String creator;
    private Date createTime;
}
