package com.example.alcphase1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class about_alc extends AppCompatActivity{
    private WebView webView;
   String url = "https://andela.com/alc/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

webView = findViewById(R.id.webview);
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setDomStorageEnabled(true);

        webView.setWebViewClient(new WebViewClient(){

                                     @Override
                                     public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                                         handler.proceed();
                                     }
                                 });

        webView.loadUrl(url);




    }
}
