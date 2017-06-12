/*
 * 文件名：HealthAction.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年6月10日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.health;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年6月10日
 * @see HealthAction
 * @since
 */
@Controller
public class HealthAction {

    @RequestMapping(value={"/health"}, method=RequestMethod.GET)
    public String health(){
        System.out.println("进入");
        return "myhealth";
    }
}
