/*
 * 文件名：LoginAction.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年6月10日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.bonc.yuan.action;

import com.bonc.yuan.entity.Person;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Hello World
 * @version 2017年6月10日
 * @see LoginAction
 * @since
 */

public class LoginAction extends ActionSupport {
    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 1L;
    public String Name;
    public int Age;
    public Person PersonTom;
    public String getResult() {
        return Result;

    }
    public Person getPersonTom() {
        return PersonTom;
    }
    
    public void setPersonTom(Person personTom) {
        PersonTom = personTom;
    }
    
    public void setResult(String result) {
        Result = result;
    }

    public String Result;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String execute() throws Exception {
        return "success";
    }

}