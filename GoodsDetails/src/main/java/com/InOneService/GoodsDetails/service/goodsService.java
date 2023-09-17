package com.InOneService.GoodsDetails.service;

import com.InOneService.GoodsDetails.model.goodDetailsResponse;
import com.InOneService.GoodsDetails.model.goodsDetails;

public interface goodsService {
    long entity(goodsDetails details);

    goodDetailsResponse getByID(long id);
    /*  goodsDetails entity(goodsDetails details);*/
}
