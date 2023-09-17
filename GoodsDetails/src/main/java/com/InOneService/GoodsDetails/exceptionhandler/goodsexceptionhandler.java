package com.InOneService.GoodsDetails.exceptionhandler;

import lombok.Data;

@Data
public class goodsexceptionhandler extends RuntimeException{

    private String errorCode;

    public  goodsexceptionhandler(String message, String errorCode){
        super(message);
        this.errorCode= errorCode;
    }

}
