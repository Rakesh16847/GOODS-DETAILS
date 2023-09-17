package com.InOneService.GoodsDetails.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class goodsAvailability {

    private String errorCode;
    private String message;

}
