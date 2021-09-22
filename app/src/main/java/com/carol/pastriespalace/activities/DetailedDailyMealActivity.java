package com.carol.pastriespalace.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.carol.pastriespalace.R;
import com.carol.pastriespalace.adapters.DetailedDailyAdapter;
import com.carol.pastriespalace.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);


        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cakes1,"Cakes","Ksh. 650","description","4.7","40 mins"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cake2,"Cake","Ksh. 650","description","4.7","40 mins"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cake3,"Cake","Ksh. 650","description","4.7","40 mins"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cake4,"Cake","Ksh. 650","description","4.7","40 mins"));
            dailyAdapter.notifyDataSetChanged();


        }

        if(type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.pie2);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pie2,"Pies","Ksh. 650","description","4.7","40 mins"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pie2,"Pies","Ksh. 650","description","4.7","40 mins"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pie3,"Pies","Ksh. 650","description","4.7","40 mins"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pie4,"Pies","Ksh. 650","description","4.7","40 mins"));
            dailyAdapter.notifyDataSetChanged();


        }

    }
}