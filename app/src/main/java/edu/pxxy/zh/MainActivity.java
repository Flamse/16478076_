package edu.pxxy.zh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import edu.pxxy.zh.adapter.ListViewAdapter;
import edu.pxxy.zh.daointerface.impl.FoodImpl;
import edu.pxxy.zh.entity.Food;
import edu.pxxy.zh.listener.ItemClickListener;


public class MainActivity extends AppCompatActivity {
//
    private ListView listView;
    private Button btnMenu;
    private ListViewAdapter adapter;
    private ItemClickListener itemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getData();

    }

    private List<Food> getData() {
        FoodImpl foodImpl = new FoodImpl(this);

        return foodImpl.findAllFood();
    }
    private void initView() {
        listView = findViewById(R.id.list_item);
        btnMenu = findViewById(R.id.btn_menu);
        adapter = new ListViewAdapter(getData(), this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"点菜啊",Toast.LENGTH_SHORT).show();
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }

}
