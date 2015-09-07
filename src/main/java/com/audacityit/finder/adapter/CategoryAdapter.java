package com.audacityit.finder.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.audacityit.finder.R;
import com.audacityit.finder.fragment.HomeFragment;
import com.audacityit.finder.model.Category;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by tusharaits on 9/4/15.
 */
public class CategoryAdapter extends ArrayAdapter<Category> implements View.OnClickListener {

    private final LayoutInflater inflater;
    private final ArrayList<Category> categoryList;
    private Activity activity;
    private HomeFragment.CategorySelectionCallbacks mCallbacks;
    private String dummyUrl = "http://www.howiwork.org";


    public CategoryAdapter(Activity activity, HomeFragment.CategorySelectionCallbacks mCallbacks, ArrayList<Category> categoryList) {
        super(activity, R.layout.layout_category_list);
        this.activity = activity;
        this.inflater = LayoutInflater.from(activity.getApplicationContext());
        this.categoryList = categoryList;
        this.mCallbacks = mCallbacks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder row;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.layout_category_list, null);
            row = new ViewHolder();
            row.bannerImage = (ImageView) convertView.findViewById(R.id.catBannerImageView);
            row.categoryImage = (ImageView) convertView.findViewById(R.id.catImageView);
            row.categoryName = (TextView) convertView.findViewById(R.id.catNameTV);
            convertView.setTag(row);
        } else {
            row = (ViewHolder) convertView.getTag();
        }

        Category category = categoryList.get(position);
        Picasso.with(activity).load(category.getIconUrl()).tag(category.getIconUrl()).
                into(row.categoryImage);
        row.categoryName.setText(category.getTitle());

        if (position % 2 == 0) {
            Picasso.with(activity).load(dummyUrl).placeholder(R.drawable.img_category_mobile)
                    .tag(category.getIconUrl())
                    .fit()
                    .into(row.bannerImage);
        } else {
            Picasso.with(activity).load(dummyUrl).placeholder(R.drawable.img_category_industry)
                    .tag(category.getIconUrl())
                    .fit()
                    .into(row.bannerImage);
        }

        row.bannerImage.setOnClickListener(this);
        row.categoryImage.setTag(position);
        row.categoryName.setTag(position);
        row.bannerImage.setTag(position);
        return convertView;
    }

    @Override
    public int getCount() {
        return categoryList.size();
    }

    @Override
    public void onClick(View v) {
        int position = Integer.parseInt(v.getTag().toString());
        mCallbacks.onCategorySelected(categoryList.get(position).getId(),
                categoryList.get(position).getTitle());
    }

    private static class ViewHolder {
        public ImageView bannerImage;
        public TextView categoryName;
        public ImageView categoryImage;
    }
}
