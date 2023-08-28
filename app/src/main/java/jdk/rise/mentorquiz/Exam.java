package jdk.rise.mentorquiz;

import android.os.Bundle;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Objects;

public class Exam extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>MCQ Exam</font>"));

        setContentView(R.layout.exam);

        web = findViewById(R.id.webv);

        WebSettings webSettings = web.getSettings();

        webSettings.setJavaScriptEnabled(true);

        web.loadUrl(getIntent().getExtras().getString("webUrl"));

        web.setWebViewClient(new WebViewClient());

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
