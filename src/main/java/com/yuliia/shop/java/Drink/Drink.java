package com.yuliia.shop.java.Drink;

public abstract class Drink {
    protected int Id;
    public abstract int getId();
    public abstract void setId(int id);


    protected String name;
    public abstract String getName();
    public abstract void setName(String name);

    protected float cost;
    public  abstract float getCost();
    public abstract void setCost(float cost);

    protected String category;
    public  abstract String getCategory();
    public abstract void setCategory(String cost);

    protected String information;
    public abstract String getInformation();
    public abstract void setInformation(String information);

    protected int quantity;
    public  abstract int getQuantity();
    public abstract void setQuantity(int cost);

    public void Print()
    {
        System.out.println(Id+" "+ name+" "+cost);
    }
}
