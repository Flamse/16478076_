package edu.pxxy.zh.entity;

public class Food {

    private Integer _id;
    private String foodname;
    private double foodprice;
    private Integer count;

    public Food() {
    }

    public Food(String foodname, double foodprice, Integer count) {
        this.foodname = foodname;
        this.foodprice = foodprice;
        this.count = count;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public double getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(double foodprice) {
        this.foodprice = foodprice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Food{" +
                "_id=" + _id +
                ", foodname='" + foodname + '\'' +
                ", foodprice=" + foodprice +
                ", count=" + count +
                '}';
    }
}
