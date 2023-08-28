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

public class Grades extends AppCompatActivity {

    Button quant_gardes;
    Button reason_gardes;
    Button gk_grades;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.grades);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>Grades</font>"));

        quant_gardes = findViewById(R.id.quant_gardes);

        reason_gardes = findViewById(R.id.reason_gardes);

        gk_grades = findViewById(R.id.gk_gardes);

        quant_gardes.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), QuantGrades.class);
            startActivity(intent);

        });

        reason_gardes.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), ReasonGrades.class);
            startActivity(intent);

        });

        gk_grades.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), GkGrades.class);
            startActivity(intent);

        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

}
