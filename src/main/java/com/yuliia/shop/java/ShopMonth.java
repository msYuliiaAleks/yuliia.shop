package com.yuliia.shop.java;

import java.util.Random;

public class ShopMonth {
    Random rand = new Random();
    int countOfBuyer = 2;//rand.nextInt(10);
    SaleOfGoods saleOfGoods = new SaleOfGoods();

    public void ShopMonth() {
        int endMounthDay = 30;
        boolean boolWeekendMarkup = false;
        System.out.println("-----------------------------Start Mounth-----------------------------");
        int Saturday = 6;
        int Sunday = 7;
        int addWeek = 7;
        for (int firstMounthDay = 1; firstMounthDay <= endMounthDay; ++firstMounthDay) {
            if (firstMounthDay == Saturday) {
                Saturday += addWeek;
                boolWeekendMarkup = true;
            } else if (firstMounthDay == Sunday) {
                Sunday += addWeek;
                boolWeekendMarkup = true;
            } else {
                boolWeekendMarkup = false;
            }
            System.out.println("-----------------Day number " + firstMounthDay + "-----------------");
            ShopDay(boolWeekendMarkup);
        }
        System.out.println("-----------------------------End Mounth-----------------------------");
    }

    public void ShopDay(boolean boolWeekendMarkup) {
        int openShop = 8;
        int closeShop = 21;
        int endHour = 23;
        boolean boolPeridMarkup = false;

        for (int startHour = 0; startHour <= endHour; startHour++) {
            if (startHour >= 18 && startHour < 20)// В период с 18:00 до 20:00 наценка составляет 8% от закупочной цены (выходные и будние дни)
            {
                boolPeridMarkup = true;
            } else {
                boolPeridMarkup = false;
            }

            if (startHour == openShop) {
                System.out.println("           -------Shop Open-------");
            }
            if (startHour >= openShop && startHour < closeShop) {
                {
                    System.out.println("           ----Now " + startHour + " o`clock----");
                }
                ShopHour(boolPeridMarkup, boolWeekendMarkup);
            }
            if (startHour == closeShop) {
                System.out.println("           -------Shop Close-------");
            }
        }
        ReplenishmentWarehouse warehouseReplenishment = new ReplenishmentWarehouse();
        warehouseReplenishment.ReplenishmentWarehouse();

    }

    public void ShopHour(boolean boolPeridMarkup, boolean boolWeekendMarkup) {
        System.out.println("count Of Buyer in hour - " + countOfBuyer);
        System.out.println("------------------------------");
        for (int i = 0; i < countOfBuyer; i++) {
            System.out.println("Sale for buyer - " + (i + 1));
            saleOfGoods.ChooseGoods(boolPeridMarkup, boolWeekendMarkup);
            System.out.println("------------------------------");
        }

    }
}
