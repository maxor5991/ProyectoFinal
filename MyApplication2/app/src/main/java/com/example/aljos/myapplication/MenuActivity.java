package com.example.aljos.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.aljos.myapplication.Recycler.HistoActivity;
import com.example.aljos.myapplication.Recycler.SuccessActivity;

/**
 * Created by aljos on 27/11/2017.
 */

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menu);
    }
    public void lista1(View v)
    {
        Intent intent = new Intent(getApplicationContext(), SuccessActivity.class);
        startActivity(intent);
    }
    public void lista2(View v)
    {
        Intent intent = new Intent(getApplicationContext(), HistoActivity.class);
        startActivity(intent);
    }
}
