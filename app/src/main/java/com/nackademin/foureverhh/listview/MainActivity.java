package com.nackademin.foureverhh.listview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] listItem = {"Jacob","Per","David","Susan","Lois","Laura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up a list view
        ListView listView = findViewById(R.id.listview);

        //Declare which Adapter going to be used
        //final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listItem);
        final PersonAdapter adapter= new PersonAdapter(this,listItem);
        listView.setAdapter(adapter);


        //set on click on items in the list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.d("App test","Radnr: "+position);

                //change the content of the list after click
                listItem[position] = "clicked";
                adapter.notifyDataSetChanged();


            }
        });

    }
}
