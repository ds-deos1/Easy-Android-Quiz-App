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

public class Reason extends AppCompatActivity {

    Button alphabet;
    Button analogy;
    Button blood;
    Button arithmetic;
    Button classification;
    Button coding;
    Button direction;
    Button missing;
    Button syllogism;
    Button mo;
    Button vd;
    Button p1;
    Button ranking;
    Button p2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>Reasoning</font>"));

        setContentView(R.layout.reason);

        alphabet = findViewById(R.id.alphabet);

        alphabet.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdddDN5exSpZJ6Rw0rEeFWi0dZzQtqJ3dv0S2-o7gmgFevPvw/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        analogy = findViewById(R.id.analogy);

        analogy.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdBU9Gk52bdBY-4AxYsgUsCkvbBK7__bERo7s4X5BbN9Br5Gw/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        blood = findViewById(R.id.blood);

        blood.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdnRzEAPqHIi5Z16QQ_GyXF6CDkDqEVoMD4CNiYgFROI7ttlA/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        arithmetic = findViewById(R.id.arithmetic);

        arithmetic.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdTS6pPxZp8IwwDWRnRNGt752yfg-PqKDS24c0xzpmBLz9obQ/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        classification = findViewById(R.id.classification);

        classification.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSeKsdotO5HinN27XV-TdIT8ZW1_MMavk1FMxdXqLA40Ae_tmw/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        coding = findViewById(R.id.coding);

        coding.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdUS1ZyMC7ifyt59baqv1GO5tRELbGcbz8QBIPsZMa2u3okTQ/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        direction = findViewById(R.id.direction);

        direction.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSejewxTUEV71h9XyNKh9t0UWd6RhKCmROF6-R6SroLLdRGQMA/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        missing = findViewById(R.id.missing);

        missing.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLScIvxNCKyb8xx-D9WIPQkVrvVmOZjGBp26vUe7UToWKs8_F5g/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        syllogism = findViewById(R.id.syllogism);

        syllogism.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSffHbjzaO7-hbDAnj2Sos2UkBy7FG0xjhVQRQmmw0RwdCpOlw/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        mo = findViewById(R.id.mo);

        mo.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLScqshegiCDZZsVL-XotGZXDabPetyrt6-i00yCBg4a1AT242w/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        vd = findViewById(R.id.vd);

        vd.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdFrw8l6lejNUjS4OvR7i-l7BzcotJIZaPMHbrDfN_b3gdjpA/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p1 = findViewById(R.id.p1);

        p1.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLScvAUiRx_fHnLARsub3kcH5UFYOXvJsiKYm37XyJLHolOay8Q/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        ranking = findViewById(R.id.ranking);

        ranking.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfIPBH38DPXq8CxKKq4-s2a8xnNMSd4QdwXpEkfVu6UYDJY3A/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p2 = findViewById(R.id.p2);

        p2.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSc1VRq3-3CF3UzjhbkRVwSg5oOuQ_Ui5pTWaMhdIGrNIGFlKg/viewform?usp=sf_link";

            Intent intent = new Intent(Reason.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
