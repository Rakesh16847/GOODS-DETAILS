package com.InOneService.GoodsDetails.repo;

import com.InOneService.GoodsDetails.entity.goodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface goodsRepo extends JpaRepository<goodsEntity,Long> {
}
