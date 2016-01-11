package com.pwk.app.test005;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.pwk.app.test005.CustomListActivity;
import com.pwk.app.test005.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    Context mContext = ListViewActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView LV = (ListView)findViewById(R.id.list);
        // 그냥 Array[]로 했을 때
        //String[] Data = {"steak", "spaghetti", "dimsom", "noodle"};

        ArrayList<String> Data = new ArrayList<>();
        Data.add("kimchi");
        Data.add("spaghetti");
        Data.add("steak");
        Data.add("dimsom");
        Data.add("rice");

        // 미리 row란 xml파일을 만들어 놓았을 때
        // ArrayAdapter<String> Adapter= new ArrayAdapter<String>(mContext,R.layout.row, R.id.txt, Data);
        ArrayAdapter<String> Adapter= new ArrayAdapter<String>(mContext,android.R.layout.simple_list_item_1, Data);
        LV.setAdapter(Adapter);

        Log.d("TAG", "LIST ITEM COUNT : " + Adapter.getCount());


        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//              startActivity(new Intent(mContext, CustomListActivity.class));
                switch (position){
                    case 0:
                        startActivity(new Intent(mContext, CustomListActivity.class));
                        break;
                    default:
                }
            }
        });
    }
}
