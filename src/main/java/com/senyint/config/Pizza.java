package com.senyint.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Created by hanpeng on 2017/4/17.
 */
@XmlRootElement(name = "pizza")
public class Pizza {

    private String name;

    private String flavor;

    private List<String> toppings = new ArrayList<String>();

    public Pizza(){

    }

    public Pizza(String name){
        this.name = name;
        this.flavor = "spicy";
        this.toppings.add("Cheese");
        this.toppings.add("bakon");
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @XmlElement
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

}