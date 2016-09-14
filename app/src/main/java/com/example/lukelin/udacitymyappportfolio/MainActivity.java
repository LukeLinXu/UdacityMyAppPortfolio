package com.example.lukelin.udacitymyappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPopularMoviesButtonClick(View view){
        showToast(R.string.text_popular_movies);
    }

    public void onStockHawkButtonClick(View view){
        showToast(R.string.text_stock_hawk);
    }

    public void onBuildItBiggerButtonClick(View view){
        showToast(R.string.text_build_it_bigger);
    }

    public void onMakeYourAppMaterialButtonClick(View view){
        showToast(R.string.text_make_your_app_material);
    }

    public void onGoUbiquitousButtonClick(View view){
        showToast(R.string.text_go_ubiquitous);
    }

    public void onCapstoneButtonClick(View view){
        showToast(R.string.text_capstone);
    }

    private void showToast(int resId){
        Toast.makeText(this, getString(R.string.toast_format, getString(resId)), Toast.LENGTH_SHORT).show();
    }
}
