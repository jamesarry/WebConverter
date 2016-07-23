package com.eloneth.webconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

     private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.webView);
        //Enable JavaScript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //Load our website url
        myWebView.loadUrl("http://www.eloneth.com/");
        //Allows website to open on the app/WebView instead on a browser
        myWebView.setWebViewClient(new WebViewClient());


    }
    // When the back btn is click, the last page browsed should be open
    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        }else{
        super.onBackPressed();
        }
        }
}
