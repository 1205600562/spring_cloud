package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * ClassName:PaymenController
 * Package:com.atguigu.springcloud.controller
 * Description:
 *
 * @date:2020/10/25 2:36 下午
 * @author:liuguoliang
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    /*
    * 新增数据
    * */
    @PostMapping("/payment/create")
    public CommonResult creat(@RequestBody Payment payment){
        int result=paymentService.create(payment );

        log.info("插入结果是++++"+result);
        if (result>0){
            return new  CommonResult(200,"新增数据成功",result);
        }else {
            return new CommonResult(444,"新增数据是失败",null);
        }
    }
    /*
    *@PathVariable和@RequestParam的区别就在于
    * ：@RequestParam用来获得静态的URL请求入参
    *
    * */
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment=paymentService.getPaymentById(id);
        log.info("查询到的数值是"+payment+"jsdhkhsdlldsalj");
        if (payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return  new CommonResult(444,"没有记录，你查询id是"+id,null);
        }



    }
}
