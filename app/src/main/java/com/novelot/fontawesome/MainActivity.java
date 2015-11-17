package com.novelot.fontawesome;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface iconFont = FontManager.getTypeface(getApplicationContext(), FontManager.FONT_AWESOME);
        FontManager.markAsIconContainer(findViewById(R.id.rootView), iconFont);
    }

}
