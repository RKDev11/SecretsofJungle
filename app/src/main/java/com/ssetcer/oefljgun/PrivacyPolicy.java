package com.ssetcer.oefljgun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PrivacyPolicy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        getWindow().addFlags(1024);
        WebView webViewPr = findViewById(R.id.internet2);
        webViewPr.loadUrl(HTTPconect.Dec("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49aGhiNzV2azBiT1pTeUtPYTF3c2hiZmhlT1J5UUdaRVU="));
    }
}