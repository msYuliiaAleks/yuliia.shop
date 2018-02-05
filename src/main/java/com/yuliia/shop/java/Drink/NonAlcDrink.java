package com.yuliia.shop.java.Drink;

public class NonAlcDrink extends Drink {

    public int getId() {
        return super.Id;
    }
    public void setId(int id) {
        super.Id = id;
    }

    public String getInformation() {
        return super.information;
    }
    public void setInformation(String information) {
        super.information = information;
    }


    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public void setName(String name) {
    super.name =name;
    }


    @Override
    public float getCost() {
        return super.cost;
    }
    @Override
    public void setCost(float cost) {
    super.cost = cost;
    }


    @Override
    public String getCategory() {
        return super.category;
    }
    @Override
    public void setCategory(String category) {
    super.category = category;
    }


    @Override
    public int getQuantity() {
        return super.quantity;
    }
    @Override
    public void setQuantity(int quantity) {
        super.quantity=quantity;

    }
}
