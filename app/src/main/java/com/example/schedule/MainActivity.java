package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
getSupportActionBar().hide();
        RecyclerView recyclerView_date = findViewById(R.id.recycler_date);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false);
        recyclerView_date.setLayoutManager(gridLayoutManager);
        DayAdapter adapter = new DayAdapter(getDay());
        recyclerView_date.setAdapter(adapter);
        RecyclerView recyclerView = findViewById(R.id.recycler_time);
        Api_Interface api_interface=RetrofitInstance.getRetrofitInstance().create(Api_Interface.class);
        Call<Model>call=api_interface.getAllData();
        call.enqueue(new Callback<Model>() {
            @Override
            public  void onResponse(Call<Model> call, Response<Model> response) {
             //  Log.d("TAG", "onResponse: "+response.body().getRecord().getData().getSlot().get(0).getSlotsList());

                GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),3,GridLayoutManager.HORIZONTAL,false);
                recyclerView.setLayoutManager(gridLayoutManager);
               TimeAdapter adapter = new TimeAdapter(response.body().getRecord().getData().getSlot().get(0).getSlotsList(),this);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Log.d("TAG", "onFailure: "+t.getLocalizedMessage());

            }
        });


    }
    public ArrayList<Day> getDay(){
        ArrayList<Day> list = new ArrayList<>();


        Day day1 = new Day("SUN", 1);
        Day day2 = new Day("MON", 2);
        Day day3 = new Day("TUE", 3);
        Day day4 = new Day("WED", 4);
        Day day5 = new Day("THU", 5);
        Day day6 = new Day("FRI", 6);
        Day day7 = new Day("SAT", 7);
        Day day8 = new Day("SUN", 8);
        Day day9 = new Day("MON", 9);
        Day day10 = new Day("TUE", 10);
        Day day11 = new Day("WED", 11);
        Day day12 = new Day("THU", 12);
        Day day13 = new Day("FRI", 13);
        Day day14 = new Day("SAT", 14);
        Day day15 = new Day("SUN", 15);
        Day day16 = new Day("MON", 16);
        Day day17 = new Day("TUE", 17);
        Day day18= new Day("WED", 18);
        Day day19 = new Day("THU", 19);
        Day day20= new Day("FRI", 20);
        Day day21= new Day("SAT", 21);
        list.add(day1);
        list.add(day2);
        list.add(day3);
        list.add(day4);
        list.add(day5);
        list.add(day6);
        list.add(day7);
        list.add(day8);
        list.add(day9);
        list.add(day10);
        list.add(day11);
        list.add(day12);
        list.add(day13);
        list.add(day14);
        list.add(day15);
        list.add(day16);
        list.add(day17);
        list.add(day18);
        list.add(day19);
        list.add(day20);
        list.add(day21);
        return list;
    }

}