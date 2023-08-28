package jdk.rise.mentorquiz;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Objects;

public class GK extends AppCompatActivity {

    Button p1;
    Button p2;
    Button p3;
    Button p4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>GK</font>"));

        setContentView(R.layout.gk);

        p1 = findViewById(R.id.p1);

        p1.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLScXH22t8b71qFR1XcTFpi271aQ3LGXTNv1PbQZY-MvozW_uaw/viewform?usp=sf_link";

            Intent intent = new Intent(GK.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p2 = findViewById(R.id.p2);

        p2.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdzgxBcqNBGVxovhM37N1ZNtTasfvcFY3G6gA9ha-Ilke4ALQ/viewform?usp=sf_link";

            Intent intent = new Intent(GK.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p3 = findViewById(R.id.p3);

        p3.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSd2DH_pWIEYm1odDCEAIiRWEuv4QeymQY_SIjbPd3EV1hfJfA/viewform?usp=sf_link";

            Intent intent = new Intent(GK.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p4 = findViewById(R.id.p4);

        p4.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSd5PlJmnpXWwsUuAA2CfZMjOFMzUs4O0eiOuQFhH1m1x9CE6g/viewform?usp=sf_link";

            Intent intent = new Intent(GK.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
}
