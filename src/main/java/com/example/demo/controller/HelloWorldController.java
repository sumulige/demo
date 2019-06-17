/**
 * Copyright (C), 2015-2019, 中信银行有限公司
 * FileName: HelloWorldController
 * Author:   willem
 * Date:     2019-06-17 15:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现访问 自定义路径下.jsp页面〉
 *
 * @author willem
 * @create 2019-06-17
 * @since 1.0.0
 */
@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
