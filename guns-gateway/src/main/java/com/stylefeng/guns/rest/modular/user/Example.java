package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/9/1 15:13
 */
@Component
// dubbo的service注解，把服务暴露出去
@Service(interfaceClass = Example.class)
public class Example {
}
