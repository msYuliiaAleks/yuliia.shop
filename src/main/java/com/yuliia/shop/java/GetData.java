package com.yuliia.shop.java;
import com.yuliia.shop.java.Drink.*;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class GetData {//implements IReader{

   // public List<Drink> GetData(Source source) {
     //   return null;
   // }
   private List<Drink> dataList  = Data.getInstance().getDataList();

  Data data = Data.getInstance();

  public void GetDrink() {

      String qvery = "select * from Drink";


      Drink alcDrink=null;
      Drink nonAlcDrink = null;
      try {

          Statement statement = ConnectDataBase.getConnection().createStatement();
          ResultSet resultSet=statement.executeQuery(qvery);
          System.out.println("good");

          while (resultSet.next()) {
              if(resultSet.getBoolean(7)==true) {
              alcDrink = new AlcDrink();
              alcDrink.setId(resultSet.getInt(1));
              alcDrink.setName(resultSet.getString(2));
              alcDrink.setCategory(resultSet.getString(4));
              alcDrink.setCost(resultSet.getFloat(3));
              alcDrink.setInformation(resultSet.getString(5));
              alcDrink.setQuantity(resultSet.getInt(6));
              dataList.add(alcDrink);
              alcDrink.Print();
              }
              else {
                  nonAlcDrink = new NonAlcDrink();
                  nonAlcDrink.setId(resultSet.getInt(1));
                  nonAlcDrink.setName(resultSet.getString(2));
                  nonAlcDrink.setCategory(resultSet.getString(4));
                  nonAlcDrink.setCost(resultSet.getFloat(3));
                  nonAlcDrink.setInformation(resultSet.getString(5));
                  nonAlcDrink.setQuantity(resultSet.getInt(6));
                  nonAlcDrink.Print();
                  dataList.add(nonAlcDrink);
              }

          }
          data.setDataList(dataList);

      }catch (Exception ex)
      {System.out.println("Error");}

  }


}
