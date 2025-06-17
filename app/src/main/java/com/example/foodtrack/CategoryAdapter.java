package com.example.foodtrack;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private List<Category> categoryList;
    int[] cardColors = {
            Color.parseColor("#FFE0B2"), // Light orange
            Color.parseColor("#B3E5FC"), // Light blue
            Color.parseColor("#D1C4E9"), // Light purple
            Color.parseColor("#C8E6C9"), // Light green
            Color.parseColor("#FFCDD2")  // Light red
    };


    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView categoryImage;
        TextView categoryName;
        CardView cardView;
        public CategoryViewHolder(View itemView) {
            super(itemView);
            categoryImage = itemView.findViewById(R.id.category_image);
            categoryName = itemView.findViewById(R.id.category_name);
            cardView = itemView.findViewById(R.id.category_card);
        }
    }

    public CategoryAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        Category category = categoryList.get(position);
        holder.categoryImage.setImageResource(category.getImageResId());
        holder.categoryName.setText(category.getName());
        int colorIndex = position % cardColors.length;
        holder.cardView.setCardBackgroundColor(cardColors[colorIndex]);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}

