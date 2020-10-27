package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName:PaymentDao
 * Package:com.atguigu.springcloud.dao
 * Description:
 *
 * @date:2020/10/25 2:17 下午
 * @author:liuguoliang
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
