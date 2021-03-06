package com.carol.pastriespalace.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.carol.pastriespalace.R;
import com.carol.pastriespalace.models.HomeHorModel;
import com.carol.pastriespalace.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {


    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select= true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizonatal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pie2, "Pie", "10-23", "4.6", "Ksh.3000"));
            homeVerModels.add(new HomeVerModel(R.drawable.pie3, "Pie", "10-23", "4.6", "Ksh.3000"));
            homeVerModels.add(new HomeVerModel(R.drawable.pie4, "Pie", "10-23", "4.6", "Ksh.3000"));
            homeVerModels.add(new HomeVerModel(R.drawable.pie4, "Pie", "10-23", "4.6", "Ksh.3000"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   row_index = position;
                   notifyDataSetChanged();

                   if(position == 0){
                       ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                       homeVerModels.add(new HomeVerModel(R.drawable.pie2, "Blueberry Pie", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.pie3, "Pecan Pie", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.pie4, "Pumpkin Pie", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.pie4, "Pie", "10-23","4.6","Ksh.3000"));

                       updateVerticalRec.callBack(position, homeVerModels);
                   }
                   else if(position == 1){
                       ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                       homeVerModels.add(new HomeVerModel(R.drawable.cake2, "Chocolate Cake", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.cake3, "Blueberry Cake", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.cake4, "Vanilla Cake", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.cake6, "Birthday Cake", "10-23","4.6","Ksh.3000"));

                       updateVerticalRec.callBack(position, homeVerModels);

                   }

                   else if(position == 2){
                       ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                       homeVerModels.add(new HomeVerModel(R.drawable.danish1, "Danish", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.danish2, "Danish", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.danish3, "Danish", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.danish5, "Danish", "10-23","4.6","Ksh.3000"));

                       updateVerticalRec.callBack(position, homeVerModels);

                   }
                   else if(position == 3){
                       ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                       homeVerModels.add(new HomeVerModel(R.drawable.mac1, "Macaron", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.mac2, "Macaron", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.mac3, "Macaron", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.mac4, "Macaron", "10-23","4.6","Ksh.3000"));

                       updateVerticalRec.callBack(position, homeVerModels);

                   }
                   else if(position == 4){
                       ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                       homeVerModels.add(new HomeVerModel(R.drawable.croi1, "Croissant", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.croi2, "Croissant", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.croi3, "Croissant", "10-23","4.6","Ksh.3000"));
                       homeVerModels.add(new HomeVerModel(R.drawable.croi4, "Croissant", "10-23","4.6","Ksh.3000"));

                       updateVerticalRec.callBack(position, homeVerModels);

                   }

                }
            });

            if(select){
                if(position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if(row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
