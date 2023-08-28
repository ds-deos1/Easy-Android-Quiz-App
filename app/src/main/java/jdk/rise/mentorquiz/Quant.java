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

public class Quant extends AppCompatActivity {

    Button mixture;
    Button area;
    Button average;
    Button boats;
    Button di;
    Button hcf;
    Button part;
    Button percentage;
    Button pipes;
    Button ages;
    Button profit;
    Button interest;
    Button work;
    Button volume;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>Quantitative Aptitude</font>"));

        setContentView(R.layout.quant);

        mixture = findViewById(R.id.mixture);

        mixture.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfQQNUsz7dodj-e7o7BkhheFDHae5V9UrlK8vV6Iqv95-i3EA/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        area = findViewById(R.id.area);

        area.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLScqS93CIM9Qc90kk94O-Lewzr7Iy8QSxDGCn9una3bGx2thUA/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        average = findViewById(R.id.average);

        average.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfVcjBklq5bYw_7BeJOl4ysa00FDq19mM3JfO75-8mV5IQiFA/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        boats = findViewById(R.id.boats);

        boats.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLScPLu-dTGGJRB6MKSj6ebzfQqBhxfR9d_eg--_pD05rdzAEHg/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        di = findViewById(R.id.di);

        di.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSeVpoJ8v6YisB6LqwkB5oIuQEDyWfIIDaWxr7axRTIxVtsU4w/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        hcf = findViewById(R.id.hcf);

        hcf.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdGaRsfXPf51rHA6uXrFFxi-0P567-L4fy0TQJRuBKJ90P2NA/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        part = findViewById(R.id.part);

        part.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdWNOx0YsQxuyLZyy9uylB3fCA3Lkc5tYVusfJ-k9or0FqKrw/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        percentage = findViewById(R.id.percentage);

        percentage.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfRrSovlCNDonWGQcHRcRtvCrKQRdLkiCM1LEe52jue_LoyMg/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        pipes = findViewById(R.id.pipes);

        pipes.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdXnR7AndcRaC5C-hXf8Qh1-gbsCLIcnlVcovz9CyfcEfFN9A/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        ages = findViewById(R.id.ages);

        ages.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfndyZj4DdKjskfLtiaG1x1I_ddjk_qSjYK_VZ4MSomiGZDhw/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        profit = findViewById(R.id.profit);

        profit.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSc3CSuh5IVBum_aQtO9-g-Lc1PgIAerrNAzbgv0DVCJuw8qDQ/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        interest = findViewById(R.id.interest);

        interest.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSeqicJmcMmO1M7Y-Rg2-8n4psjZFk5DVU_bLZCOyVuk_LHu7w/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        work = findViewById(R.id.work);

        work.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfRvGAzt8A9A0y00gx_TxNWrIjSgQMQ1GL4uGQ7vl2koqY95w/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        volume = findViewById(R.id.volume);

        volume.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLSdiTOh049PiISzbr2INbRP8kuGHddpjMjH5zEh0Wh-zFDK7_A/viewform?usp=sf_link";

            Intent intent = new Intent(Quant.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
