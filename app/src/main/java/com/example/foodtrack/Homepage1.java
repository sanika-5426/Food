package com.example.foodtrack;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import com.google.android.material.navigation.NavigationBarView;

import android.content.Intent;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.example.foodtrack.R;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;
public class Homepage1 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        ImageButton profileicon;
        setContentView(R.layout.activity_homepage1);

            RecyclerView recyclerView;
            List<Category> categoryList;
            CategoryAdapter categoryAdapter;
        profileicon=findViewById(R.id.profileicon);
        profileicon.setOnClickListener(
                v -> {
                    Intent intent = new Intent(Homepage1.this, Profile.class);
                    startActivity(intent);
                }
        );


                recyclerView = findViewById(R.id.recyclerViewCategories);
                recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

                categoryList = new ArrayList<>();
                categoryList.add(new Category(R.drawable.burger, "Burger"));
                categoryList.add(new Category(R.drawable.pizza, "Pizza"));
                categoryList.add(new Category(R.drawable.snacks, "Snacks"));
                categoryList.add(new Category(R.drawable.water, "Water"));
                categoryList.add(new Category(R.drawable.burger, "Burger"));
                categoryList.add(new Category(R.drawable.pizza, "Pizza"));
                categoryList.add(new Category(R.drawable.snacks, "Snacks"));
                categoryList.add(new Category(R.drawable.water, "Water"));


                        List<FoodItem> foodItems = new ArrayList<>();
                        foodItems.add(new FoodItem(R.drawable.burger, "Chicken Burger", "₹ 155", 4.8f));
                        foodItems.add(new FoodItem(R.drawable.pizza, "Cheese Pizza", "₹ 199", 4.5f));
                        foodItems.add(new FoodItem(R.drawable.snacks, "Chicken Pop", "₹ 149", 4.7f));
                         categoryAdapter = new CategoryAdapter(categoryList);
                         recyclerView.setAdapter(categoryAdapter);

                        RecyclerView rvPopularFood = findViewById(R.id.rvPopularFood);
                        rvPopularFood.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

                        FoodAdapter foodAdapter = new FoodAdapter(foodItems);
                        rvPopularFood.setAdapter(foodAdapter);
//
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.nav_home:
//                        // Load Home Fragment
//                        return true;
//                    case R.id.nav_food:
//                        // Load Food Fragment
//                        return true;
//                    case R.id.nav_explore:
//                        // Load Explore Fragment
//                        return true;
//                    case R.id.nav_card:
//                        // Load Card Fragment
//                        return true;
//                    case R.id.nav_reorder:
//                        // Load Reorder Fragment
//                        return true;
//                }
//                return false;
//            }
//        });
//        Intent intent = new Intent(currentActivity.this, nextActivity.class);
//        startActivity(intent);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}