package ru.startandroid.develop.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Article_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_activity);

        WebView webView = (WebView) findViewById(R.id.wvMain);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();

//        String encodedHtml = Base64.encodeToString(intent.getStringExtra("content").getBytes(),
//                Base64.DEFAULT);

        webView.loadUrl(intent.getStringExtra("content"));


    }
}