package com.chocolacate.chocoboard.api.entity;

import java.io.Serializable;

public class Response<T> implements Serializable {
    private static final long serialVersionUID = -5021627603312114513L;

    private Integer code;
    private String message;
    private T data;


}
