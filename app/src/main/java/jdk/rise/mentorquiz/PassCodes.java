package jdk.rise.mentorquiz;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Objects;

public class PassCodes extends AppCompatActivity {

    Button quant;
    Button reasoning;
    Button gk;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pass_codes);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#FF6961'>Pass Codes</font>"));

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

}
