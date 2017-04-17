package com.senyint.config;

/**
 * Created by hanpeng on 2017/4/17.
 */
public class MyThymeleafView extends org.thymeleaf.spring4.view.ThymeleafView {

    public MyThymeleafView() {
        super();
        setContentType("text/xml");
    }
}
