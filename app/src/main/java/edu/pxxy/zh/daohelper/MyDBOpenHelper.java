package edu.pxxy.zh.daohelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import edu.pxxy.zh.daointerface.impl.FoodImpl;
import edu.pxxy.zh.entity.Food;

public class MyDBOpenHelper extends SQLiteOpenHelper {

    private static final String TAG = "MyDBOpenHelper";
    private static final String DB_NAME = "zh.db";
    private static final int DB_VERSION = 1;

    public MyDBOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d(TAG, "数据库,创建数据库");
        String sql = "create table food(_id integer primary key autoincrement , foodname text ,foodprice real , count integer )";
        sqLiteDatabase.execSQL(sql);
        addData();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.d(TAG, "数据库更新了...");
    }
    private void addData(){
        FoodImpl foodImpl = new FoodImpl();
        Food food1=new Food("小炒肉",20,0);
        foodImpl.insertFood(food1);
        Food food2=new Food("青椒肉丝",24,0);
        foodImpl.insertFood(food2);
        Food food3=new Food("西红柿炒鸡蛋",12,0);
        foodImpl.insertFood(food3);
        Food food4=new Food("红烧鱼头",8,0);
        foodImpl.insertFood(food4);
        Food food5=new Food("红烧猪蹄",25,0);
        foodImpl.insertFood(food5);
        Food food6=new Food("红烧鱼块",18,0);
        foodImpl.insertFood(food6);
        Food food7=new Food("紫菜蛋汤",10,0);
        foodImpl.insertFood(food7);

    }

}

