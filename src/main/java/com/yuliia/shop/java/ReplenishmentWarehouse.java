package com.yuliia.shop.java;
import com.yuliia.shop.java.Drink.Drink;


import java.util.List;

public class ReplenishmentWarehouse {

    private List<Drink> dataList  = Data.getInstance().getDataList();

    public void ReplenishmentWarehouse() {
        System.out.println("---Replenishment Warehouse---");
        for (int i = 0; i < dataList.size(); i++) {

            int temp = dataList.get(i).getQuantity();
            if (temp < 10) {
                temp += 150;
                dataList.get(i).setQuantity(temp);
                /*dr.dataReport.get(i + 1).set(QUANTITYOFORDEREDGOODS,
                        String.valueOf(
                                parseInt(dr.dataReport.get(i + 1).get(QUANTITYOFORDEREDGOODS)) + 150));

                dr.dataReport.get(i + 1).set(OUTLAY,
                        String.valueOf(
                                parseFloat(dr.dataReport.get(i + 1).get(OUTLAY))
                                        + parseFloat(d.datalist.get(i).get(COST)) * 150));*/
                System.out.println("Replenishment(+150) - " + dataList.get(i).getName());
            }
        }
    }
}


