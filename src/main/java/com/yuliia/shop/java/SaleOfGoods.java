package com.yuliia.shop.java;

import com.yuliia.shop.java.Drink.Drink;
import com.yuliia.shop.java.Markup.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class SaleOfGoods {

    private Markup markup;
    private Data data = Data.getInstance();
    private Random rand = new Random();
    List<Drink> dataList = data.getDataList();

    public void ChooseGoods(boolean boolPeridMarkup, boolean boolWeekendMarkup) {
        int countOfGoods = rand.nextInt(10);
        int[] arrGoods = new int[countOfGoods + 1];//array of goods
        System.out.println("Count of goods - " + countOfGoods);
        int duplication = 0;

        for (int i = 0; i < countOfGoods; i++) {
             int temp = rand.nextInt(dataList.size()) + 0;

             while (dataList.get(temp).getQuantity() < 1) {
                 temp = rand.nextInt(dataList.size()) + 0;
               }
             arrGoods[i] = temp;
         }


        Arrays.sort(arrGoods);// sort for comfortable finding duplication

        for (int i = 0; i < countOfGoods; i++) {

            if (arrGoods[i] == arrGoods[i + 1]) {
                duplication++;
            } else {
                duplication = 0;
            }

            if (duplication > 2) {
                 markup = new MultiMarkup();
            } else if (boolPeridMarkup) {
                markup = new PeriodMarkup();
            } else if (boolWeekendMarkup) {
                markup = new WeekendMarkup();
            } else {
                markup = new StandartMarkup();
            }




            SaleForOneBuyer(arrGoods[i]);


        }
    }


    public void SaleForOneBuyer(int randGood) {

        float cost = 0f;
        System.out.println(dataList.get(randGood).getCost());
        if (markup != null) {

            cost = dataList.get(randGood).getCost() * markup.GetMarkups();
            System.out.print("  Sale Cost - ");
            System.out.print(String.format("%.2f",cost));
        } else {
            System.out.println("error");
        }
        System.out.println(" - " + dataList.get(randGood).getName());

      /*  dr.dataReport.get(randGood + 1).set(PROFIT,
                String.valueOf(
                        parseFloat(dr.dataReport.get(randGood + 1).get(PROFIT)) +
                                (cost -
                                        parseFloat(d.datalist.get(randGood).get(COST))
                                )));*/

        int temp = dataList.get(randGood).getQuantity();
        temp -= 1;
        dataList.get(randGood).setQuantity(temp);//sale of one good
       /* drdataReport.get(randGood + 1).set(QUANTITYOFGOODSSOLD,
                String.valueOf(
                        parseInt(dr.dataReport.get(randGood + 1).get(QUANTITYOFGOODSSOLD)) + 1));*/

    }
}
