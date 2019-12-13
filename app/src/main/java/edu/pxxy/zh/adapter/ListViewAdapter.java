package edu.pxxy.zh.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.pxxy.zh.R;
import edu.pxxy.zh.entity.Food;

public class ListViewAdapter extends BaseAdapter {

    private List<Food> foodList;
    private Context context;


    public ListViewAdapter(List<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (holder == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.listview_item, null, false);
            holder.iv_img = view.findViewById(R.id.food_item_img);
            holder.tv_title = view.findViewById(R.id.food_item_title);
            holder.tv_price = view.findViewById(R.id.food_item_price);
            holder.tv_count = view.findViewById(R.id.food_item_count);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv_title.setText(foodList.get(i).getFoodname());
        holder.tv_price.setText(String.valueOf(foodList.get(i).getFoodprice()));
        holder.tv_count.setText(String.valueOf(foodList.get(i).getCount()));
        return view;
    }

    class ViewHolder {
        ImageView iv_img;
        TextView tv_title;
        TextView tv_price;
        TextView tv_count;
    }

}
