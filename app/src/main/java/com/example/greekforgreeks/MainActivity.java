package com.example.greekforgreeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView=findViewById(R.id.web);
        webView.loadUrl("https://www.geeksforgeeks.org/how-to-use-webview-in-android/");

        webView.setWebViewClient(new WebViewClient());
    }
}