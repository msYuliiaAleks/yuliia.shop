package com.yuliia.shop.java;
import com.yuliia.shop.java.Drink.Drink;

//import Drink.Drink;

import java.util.ArrayList;
import java.util.List;

//Singletone
public class Data {
    private static Data instanceData;

    private Data() {
    }

    static {
        try {
            instanceData = new Data();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Data getInstance() {
        return instanceData;
    }

    List<Drink> dataList = new ArrayList<Drink>();

    public List<Drink> getDataList() {
        return dataList;
    }

    public void setDataList(List<Drink> dataList) {
        this.dataList = dataList;
    }

}


