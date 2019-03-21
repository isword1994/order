package com.example.order.expection;

import com.example.order.enums.ResultEnum;

public class OrderExcpetion extends RuntimeException {
    private Integer code;

    public OrderExcpetion(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderExcpetion(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
