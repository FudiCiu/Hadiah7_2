package com.latihanandroid.hadiah7_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPresident;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPresident=(RecyclerView)findViewById(R.id.rvPresident);
        rvPresident.setHasFixedSize(true);
        showToRecycle();
    }

    private void  showToRecycle(){
        rvPresident.setLayoutManager(new LinearLayoutManager(this));
        PresidentAdapter presidentAdapter= new PresidentAdapter(PresidentData.getPresidents(),this);
        rvPresident.setAdapter(presidentAdapter);
    }
}
