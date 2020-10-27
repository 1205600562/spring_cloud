package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName:Payment
 * Package:com.atguigu.springcloud.entities
 * Description:
 *
 * @date:2020/10/25 2:04 下午
 * @author:liuguoliang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private  Long id;
    private String serial;
}
