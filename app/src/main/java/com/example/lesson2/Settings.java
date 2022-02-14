package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Settings extends AppCompatActivity implements View.OnClickListener {


    RadioButton ThemeOne;
    RadioButton ThemeTwo;
    Button Back;
    public static final String Pref_Name = "Key_pref";
    public static final String Pref_Theme = "Key_pref_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(ThemeApp.CurrentTheme);
        setContentView(R.layout.activity_settings);
        initialization();
        setListeners();


    }

    private void setListeners() {
        ThemeOne.setOnClickListener(this);
        ThemeTwo.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    private void initialization() {
        ThemeOne = findViewById(R.id.ThemeOne);
        ThemeTwo = findViewById(R.id.ThemeTwo);
        Back = findViewById(R.id.Back);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.ThemeOne): {
                ThemeApp.CurrentTheme = R.style.MyTheme_lesson2;
                recreate();
                break;
            }
            case (R.id.ThemeTwo): {
                ThemeApp.CurrentTheme = R.style.MyTheme_lesson2_Second;
                recreate();
                break;

            }
            case (R.id.Back): {
                Intent intent = new Intent(Settings.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }

    public void setUpTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(Pref_Name, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(Pref_Theme, codeStyle);
        editor.apply();
    }

    public int getUpTheme() {
        SharedPreferences sharedPref = getSharedPreferences(Pref_Name, MODE_PRIVATE);
        return sharedPref.getInt(Pref_Theme, R.style.MyTheme_lesson2);
    }
}
