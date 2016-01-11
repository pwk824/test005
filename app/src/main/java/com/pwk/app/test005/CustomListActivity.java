package com.pwk.app.test005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView LV = (ListView)findViewById(R.id.list);

        String[] Title = {"steak", "spaghetti", "dimsom", "noodle"};
        String[] Date = {"13,000원", "8,000원", "13,000원", "3,000원"};

        CustomListAdapter Adapter = new CustomListAdapter(CustomListActivity.this, Title, Date);
        LV.setAdapter(Adapter);

    }
}
