package edu.pxxy.zh.daointerface.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.pxxy.zh.daohelper.MyDBOpenHelper;
import edu.pxxy.zh.daointerface.FoodDao;
import edu.pxxy.zh.entity.Food;

public class FoodImpl implements FoodDao {

    private MyDBOpenHelper myDBOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public FoodImpl (Context context){
        myDBOpenHelper = new MyDBOpenHelper(context);
        sqLiteDatabase = myDBOpenHelper.getWritableDatabase();
    }
    public FoodImpl (){

    }

    @Override
    public List<Food> findAllFood() {
        List<Food> foodList = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.query("food", null, null, null, null, null, null);
        while (cursor.moveToNext()){
            String foodname = cursor.getString(cursor.getColumnIndex("foodname"));
            String foodprice = cursor.getString(cursor.getColumnIndex("foodprice"));
            String count = cursor.getString(cursor.getColumnIndex("count"));
            Food food = new Food();
            food.setFoodname(foodname);
            food.setFoodprice(Double.parseDouble(foodprice));
            food.setCount(Integer.parseInt(count));
            foodList.add(food);
        }
        return foodList;
    }

    @Override
    public long delectAllFood() {
        sqLiteDatabase.execSQL("delete from food");
        return 0;
    }

    @Override
    public List<Food> findFoodByName(String foodName) {
        List<Food> foodList = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.query("food", null, null, null, null, null, null);
        while (cursor.moveToNext()){
            String foodname = cursor.getString(cursor.getColumnIndex("foodname"));
            String foodprice = cursor.getString(cursor.getColumnIndex("foodprice"));
            String count = cursor.getString(cursor.getColumnIndex("count"));
            Food food = new Food();
            food.setFoodname(foodname);
            food.setFoodprice(Double.parseDouble(foodprice));
            food.setCount(Integer.parseInt(count));
            foodList.add(food);
        }
        return foodList;
    }

    @Override
    public Long insertFood(Food food) {
        ContentValues cv = new ContentValues(3);
        cv.put("foodname",food.getFoodname());
        cv.put("foodprice",food.getFoodprice());
        cv.put("count",food.getCount());
        sqLiteDatabase.insert("food",null,cv);
        return null;
    }


    @Override
    public int deleteFood(String foodName) {

        return 0;
    }

    @Override
    public int updateFoodPrice(String foodName) {

        return 0;
    }
}
