package edu.pxxy.zh;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import edu.pxxy.zh.adapter.ListViewAdapter;
import edu.pxxy.zh.daointerface.impl.FoodImpl;
import edu.pxxy.zh.entity.Food;
import edu.pxxy.zh.listener.ItemClickListener;

public class MenuActivity extends AppCompatActivity {
    private ListView listView;
    private Button btnMenu;
    private ListViewAdapter adapter;
    private ItemClickListener itemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);



    }
    private List<Food> getData() {
        FoodImpl foodImpl = new FoodImpl(this);

        return foodImpl.findAllFood();
    }
    private void initView() {

    }
}
