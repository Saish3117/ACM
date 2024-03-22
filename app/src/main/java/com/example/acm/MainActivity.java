package com.example.acm;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView ACM;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ACM = findViewById(R.id.ACM);
        ACM.getSettings().setJavaScriptEnabled(true);
        ACM.setWebViewClient(new WebViewClient());
        ACM.loadUrl("https://sbjitmr.acm.org/");
    }

}