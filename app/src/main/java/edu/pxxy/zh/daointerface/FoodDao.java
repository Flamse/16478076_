package edu.pxxy.zh.daointerface;



import java.util.List;

import edu.pxxy.zh.entity.Food;

public interface FoodDao {

    /**
     * 查询所有菜品
     * @return
     */
    List<Food> findAllFood();

    /**
     * 删除所有菜品
     * @return
     */
    long delectAllFood();

    /**
     * 根据菜名查询
     * @param foodName
     * @return
     */
    List<Food> findFoodByName(String foodName);

    /**
     * 插入菜品
     * @param food
     * @return
     */
    Long insertFood(Food food);

    /**
     *根据菜名删除
     * @param foodName
     * @return
     */
    int deleteFood(String foodName);

    /**
     * 根据菜名修改价格
     * @param foodName
     * @return
     */
    int updateFoodPrice(String foodName);
}
