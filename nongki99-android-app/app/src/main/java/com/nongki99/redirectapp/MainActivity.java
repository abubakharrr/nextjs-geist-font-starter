package com.nongki99.redirectapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String REDIRECT_URL = "https://nongki99c.estate/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(REDIRECT_URL));
        startActivity(browserIntent);
        finish();
    }
}
