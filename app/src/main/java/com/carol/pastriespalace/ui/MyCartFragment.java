package com.carol.pastriespalace.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carol.pastriespalace.R;
import com.carol.pastriespalace.adapters.CartAdapter;
import com.carol.pastriespalace.models.CartModel;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;



    public MyCartFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);


        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.cakes1, "Chocolate cake","4500","4.3"));
        list.add(new CartModel(R.drawable.pie2, "Blueberry Pie","2000","4.1"));
        list.add(new CartModel(R.drawable.danish2, "Danish","450","4.7"));
        list.add(new CartModel(R.drawable.mac2, "Macarons","800","4.8"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);


        return view;
    }
}