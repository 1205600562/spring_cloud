package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * ClassName:PaymentService
 * Package:com.atguigu.springcloud.service
 * Description:
 *
 * @date:2020/10/25 2:39 下午
 * @author:liuguoliang
 */
public interface PaymentService {

    Integer create(Payment payment);

    Payment getPaymentById(Long id);
}
