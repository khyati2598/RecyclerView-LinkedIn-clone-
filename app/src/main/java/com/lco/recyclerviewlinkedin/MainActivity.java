package com.lco.recyclerviewlinkedin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView namelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namelist=findViewById(R.id.recyclerView);
        namelist.setLayoutManager(new GridLayoutManager(this,2));
        String name[]={"Mayank","Saksham","Runvijay","Ankur","Rahul","Danish","Bhawesh","Anu"};
        namelist.setAdapter(new MyAdapter(name));
    }
}
