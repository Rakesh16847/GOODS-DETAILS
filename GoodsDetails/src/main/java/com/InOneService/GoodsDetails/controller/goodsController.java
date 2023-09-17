package com.InOneService.GoodsDetails.controller;

import com.InOneService.GoodsDetails.model.goodDetailsResponse;
import com.InOneService.GoodsDetails.model.goodsDetails;
import com.InOneService.GoodsDetails.service.goodsService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*import com.InOneService.GoodsDetails.model.goodsDetailsResponse;*/

@RestController
@RequestMapping("/goods")
public class goodsController {
    @Autowired
    private goodsService goodsService;

 /*   @PostMapping("/post")
    public goodsDetails entity(@RequestBody goodsDetails details)
    {
        return goodsService.entity(details);
        
    }*/

    @PostMapping("/post")
    public ResponseEntity <Long> entity(@RequestBody goodsDetails details)
    {
        long getdetails =  goodsService.entity(details);
        return new ResponseEntity<>(getdetails, HttpStatus.CREATED);

    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<goodDetailsResponse>  getById (@PathVariable("Id") long Id)
    {
        goodDetailsResponse detailsResponse = goodsService.getByID(Id);
        return new ResponseEntity<>(detailsResponse, HttpStatus.OK);

    }

}
