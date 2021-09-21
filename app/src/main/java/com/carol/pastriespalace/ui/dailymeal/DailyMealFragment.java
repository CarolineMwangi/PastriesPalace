package com.carol.pastriespalace.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.carol.pastriespalace.R;
import com.carol.pastriespalace.adapters.DailyMealAdapter;
import com.carol.pastriespalace.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView= root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels=new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.cake,"Breakfast","30% off","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.cake,"Lunch","30% off","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.cake,"Dinner","30% off","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.cake,"Sweets","30% off","Description"));


        dailyMealAdapter=new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }


}