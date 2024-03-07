package com.example.uwux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.my_text_view);
        String text = "18.61";
        SpannableString spannableString = new SpannableString(text);

        // Set size of "18" to 30sp
        spannableString.setSpan(new AbsoluteSizeSpan(110, true), 0, 2, Spanned.SPAN_INCLUSIVE_INCLUSIVE);

        // Set size of "61" to 20sp
        spannableString.setSpan(new AbsoluteSizeSpan(35, true), 3, 5, Spanned.SPAN_INCLUSIVE_INCLUSIVE);

        textView.setText(spannableString);

        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}