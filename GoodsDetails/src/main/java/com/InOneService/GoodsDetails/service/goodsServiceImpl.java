package com.InOneService.GoodsDetails.service;

import com.InOneService.GoodsDetails.entity.goodsEntity;
import com.InOneService.GoodsDetails.exceptionhandler.goodsexceptionhandler;
import com.InOneService.GoodsDetails.model.goodDetailsResponse;
import com.InOneService.GoodsDetails.model.goodsDetails;
import com.InOneService.GoodsDetails.repo.goodsRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class goodsServiceImpl  implements goodsService{

    @Autowired
    private goodsRepo repo;

    @Override
    public long entity(goodsDetails details) {
        goodsEntity goods = goodsEntity.builder()
                .Id(details.getId())
                .name(details.getName())
                .amount(details.getAmount())
                .quantity(details.getQuantity())
                .build();
        repo.save(goods);
        return goods.getId();
    }

    @Override
    public goodDetailsResponse getByID(long id) {
        goodsEntity getentity = repo.findById(id)
                .orElseThrow(() -> new goodsexceptionhandler("Goods Id not find in the given field ", "GOODS NOT Found"));
             goodDetailsResponse response = new goodDetailsResponse();
        BeanUtils.copyProperties(getentity,response);
        return response;
    }
    /*@Override
    public goodsDetails entity(goodsDetails details) {
        goodsEntity goods = goodsEntity.builder()
                .Id(details.getId())
                .name(details.getName())
                .amount(details.getAmount())
                .quantity(details.getQuantity())
                .build();
        repo.save(goods);
        return details;
    }*/




}
