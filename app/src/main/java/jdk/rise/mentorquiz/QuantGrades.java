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

public class QuantGrades extends AppCompatActivity {

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

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>Quantitative Grades</font>"));

        setContentView(R.layout.q_grades);

        mixture = findViewById(R.id.mixture);

        mixture.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vT-iDEx6taIYp0_dCwd0ycmnyGg6823Gr_yyWw5hn-2a2qlCefX0ZoEDrUbRRE_WxEmiZGLxJPwN4xp/pubhtml?gid=1180616527&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        area = findViewById(R.id.area);

        area.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTJP9P98enciuIAP5f0wmPEBo4fvLafO477JlJIJVVfGJM-0dzvJ6I95AqmpTINv5bXyGUk8-J-kgQt/pubhtml?gid=485080702&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        average = findViewById(R.id.average);

        average.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQY3bdkP9X2WtH1BTsQ48G9Coc46GAsPYuwKTRwTBOow-Wcf7eyiY3csa-0eY7jEjBu1VWArwQ_fEzn/pubhtml?gid=491381679&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        boats = findViewById(R.id.boats);

        boats.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/forms/d/e/1FAIpQLScPLu-dTGGJRB6MKSj6ebzfQqBhxfR9d_eg--_pD05rdzAEHg/viewform?usp=sf_link";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        di = findViewById(R.id.di);

        di.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRM6rJjShh0lLnDtypJNjE_jX21WEoGQoTjyZvbJeNLBSwMYFyuZAze2FgrkFu4m1DTsr686FAMUbr9/pubhtml?gid=384979533&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        hcf = findViewById(R.id.hcf);

        hcf.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vSf2_HfydVJtm4fTMI3Xy7AWnIxCrulnlQT36HbcjMBK8k3X1_kcMAgW1If2rxGeBM940Ec6UYHEW1Y/pubhtml?gid=275158677&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        part = findViewById(R.id.part);

        part.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQdWk-IF365f1v_0R0M7EvbJ8pWd7NUv2oH9XWWjnTY_Liyqmbhbf2Zh_RmSSMQOdhgexWfgNkvSNZ1/pubhtml?gid=2117206575&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        percentage = findViewById(R.id.percentage);

        percentage.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTYbuy37H_Ry_YRbjM4p7e8RLcGoY6zhXy6uv5LUEk02LVZot8urWQLrIwJZ7Y-bruq5CDtk1E--vpj/pubhtml?gid=1944411109&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        pipes = findViewById(R.id.pipes);

        pipes.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vR5jysxP_XfjYNIWoaBGZCZle7vMkPMGwgHGGKd_ejj1dlliVCglI3NjMiG-qs5V-PUuO2VjwwA7VHJ/pubhtml?gid=1030473744&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        ages = findViewById(R.id.ages);

        ages.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQApDKKw5Cuos9IWsmIjspi_IyJ5-4lh3bZH_FKQlMJ4h2R6R376LnmU8_KjkUSLGUbz8iAqg3EZoCx/pubhtml?gid=382390265&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        profit = findViewById(R.id.profit);

        profit.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRykFKmeEqDNLESq7cENsuGAiQYpgrG8cv1O1oihEnL1RLviPUpoCXgNaRTsBPzi8nNnyB_nG_oK9NP/pubhtml?gid=343759032&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        interest = findViewById(R.id.interest);

        interest.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vS4J-3cgwE5abCV1-nRBq68KTzxGO0IfhlI42zO9yLY4wERBy9YANN5J5pULRQZtRHfKN8GklgWQWoc/pubhtml?gid=1370952866&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        work = findViewById(R.id.work);

        work.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQ4TFIyvUnHB9MZRDydAx3fhgJyMXkAlS2op6rVriZWD5O_EQJw4byGfTez8kVE7JniSxw66FkacFJ7/pubhtml?gid=2144333394&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        volume = findViewById(R.id.volume);

        volume.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTgIBvUV6rYf912X7MMnV3C_HFLt5u1YrDf0dnwkVJ-DVeDUg4nmMR-q-VG8EJayIOoC9IoQdozJIsi/pubhtml?gid=1761882102&single=true";

            Intent intent = new Intent(QuantGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
