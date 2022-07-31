/*
 * @author: Oliver Lester
 * @description: This program creates an app that showcases the theme of an Arizonan town.
 *  Will act as a travel guide of sorts
 */
package com.example.themecode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ScrollView scroll = new ScrollView(this);
        scroll.setBackgroundColor(Color.parseColor("#FEF1E6"));

        LinearLayout linLayout = new LinearLayout(this);
        linLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        linLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        linLayout.setOrientation(LinearLayout.VERTICAL);
        scroll.addView(linLayout);

        TextView name = new TextView(this);
        String tName = new String("Winslow, Arizona");
        name.setText(tName);
        name.setPaddingRelative(50,100,50,50);
        name.setTextColor(Color.parseColor("#FFB085"));
        name.setGravity(Gravity.CENTER);
        name.setTextSize(TypedValue.COMPLEX_UNIT_PT,20);
        linLayout.addView(name);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(1000, 725);

        ImageView picOne = new ImageView(this);
        picOne.setLayoutParams(lp);
        picOne.setImageResource(R.drawable.pic1);
        linLayout.addView(picOne);
        picOne.setPaddingRelative(50,50,50,50);
        picOne.setBackgroundColor(Color.parseColor("#90AACB"));

        TextView townDes = new TextView(this);
        String tDes = new String("A small town of nearly 10,000 people. Winslow sits in the" +
                " path of the I-40. Take a drive through downtown on Historic Route 66. Experience" +
                " restaurants and sites that manage to capture the essence of the road they find" +
                " themselves on. And don\'t forget to visit the corner that was immortalized by" +
                " the rock band The Eagles.");
        townDes.setText(tDes);
        townDes.setPaddingRelative(50,50,50,50);
        townDes.setTextColor(Color.parseColor("#FFB085"));
        townDes.setGravity(Gravity.CENTER);
        townDes.setTextSize(TypedValue.COMPLEX_UNIT_PT,10);
        townDes.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        linLayout.addView(townDes);

        ImageView picTwo = new ImageView(this);
        picTwo.setLayoutParams(lp);
        picTwo.setImageResource(R.drawable.lp);
        linLayout.addView(picTwo);
        picTwo.setPaddingRelative(50,50,50,50);
        picTwo.setBackgroundColor(Color.parseColor("#90AACB"));

        TextView lpDes = new TextView(this);
        String lDes = new String("One of many Harvey Houses. La Posada acts as the only " +
                "Harvey House that acts as it was originally intended, that being a hotel. During" +
                " your stay, enjoy contemporary Southwest Cuisine at the Turquoise Room.");
        lpDes.setText(lDes);
        lpDes.setPaddingRelative(50,50,50,50);
        lpDes.setTextColor(Color.parseColor("#FFB085"));
        lpDes.setGravity(Gravity.CENTER);
        lpDes.setTextSize(TypedValue.COMPLEX_UNIT_PT,5);
        lpDes.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        linLayout.addView(lpDes);

        ImageView picThree = new ImageView(this);
        picThree.setLayoutParams(lp);
        picThree.setImageResource(R.drawable.tex);
        linLayout.addView(picThree);
        picThree.setPaddingRelative(50,50,50,50);
        picThree.setBackgroundColor(Color.parseColor("#90AACB"));

        TextView texDes = new TextView(this);
        String xDes = new String("One of the many sites that bring a sense of traveling " +
                "cross country during the early life of automobiles");
        texDes.setText(xDes);
        texDes.setPaddingRelative(50,50,50,50);
        texDes.setTextColor(Color.parseColor("#FFB085"));
        texDes.setGravity(Gravity.CENTER);
        texDes.setTextSize(TypedValue.COMPLEX_UNIT_PT,5);
        texDes.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        linLayout.addView(texDes);

        super.onCreate(savedInstanceState);
        setContentView(scroll);
    }
}