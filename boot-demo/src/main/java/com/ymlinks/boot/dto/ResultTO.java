package com.ymlinks.boot.dto;

import lombok.Data;

@Data
public class ResultTO<T> {

    private int code = 200;
    private boolean success = true;
    private String msg;
    private T result;
}
