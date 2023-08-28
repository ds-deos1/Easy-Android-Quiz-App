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

public class ReasonGrades extends AppCompatActivity {

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

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>Reasoning Grades</font>"));

        setContentView(R.layout.r_grades);

        alphabet = findViewById(R.id.alphabet);

        alphabet.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTS6LIOmI5OhFN8OvKwQXM7xk9xmnXfwk0hi2p5QG039cEa_oXp03Iy5-MUF9EZSxFRt69gWrt0PUQ1/pubhtml?gid=365208626&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        analogy = findViewById(R.id.analogy);

        analogy.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vT1RlFUET0ZjoraOFdyrMzLFHuWQlQEboo_QYdqh7Hg85xsxKoq8DeavQXUnITyoaFdmsyUfL7PTBIY/pubhtml?gid=556883347&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        blood = findViewById(R.id.blood);

        blood.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vSw8Plfa159ioxBPF2-mzFNx6xQQnEuvqVDUT37OHB1vRGFmAgkCkFwX_yZ8n4AkMu2_0e5vcSY2C5O/pubhtml?gid=558927856&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        arithmetic = findViewById(R.id.arithmetic);

        arithmetic.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRSQcwtQuFOjI7b8TKhLAiT0Hll7VJxqqsjzP0tLQZaPvFjTRREtfZHKntMm6-30dBK_PC9bv9f8yNh/pubhtml?gid=1153894632&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        classification = findViewById(R.id.classification);

        classification.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vS9K4oRZyHPDNb6zriSa0s46gICUd8Ws-oLFzxRPPVcz58Co2VLxLhCIpqyQpctXe7wlbxDBSz4ONVT/pubhtml?gid=326396677&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        coding = findViewById(R.id.coding);

        coding.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTyHlqSd-sWJGyC2mYnvoag82IUBAksK0MmMNXlzz24h9mdLB9wen_hBmNaeG36IlxOWDtJmKT2TX5e/pubhtml?gid=1155824865&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        direction = findViewById(R.id.direction);

        direction.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRQILw081-RU1MqqFU9Xp4aIclFT7Bm3_GuP57tH1qefTSEmpchMkKcdnLyOpvqUe87-_60w90jZ7LG/pubhtml?gid=1445226723&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        missing = findViewById(R.id.missing);

        missing.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQCqVFIzOa9z66GVF8Qm-RInB0RoaZpH1YlbB6Wig6BhVGoE_Z8NiQG3Y2R1ajAJ9eT-NAWvfKt_lKg/pubhtml?gid=514672845&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        syllogism = findViewById(R.id.syllogism);

        syllogism.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vTpdV9ycco720DYgCLZiq2yeFNAl1KPJwlfa_ttDt75PF9xxxB46jBjTvE2csqhqds1WKa7TdJ1FBCB/pubhtml?gid=988966379&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        mo = findViewById(R.id.mo);

        mo.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQeUoMEREbE_EHO63J0HE8TP-qXeWQo7qNxwFBrWkBV77oNeGxM5dZpTahgnGK8aCoz_MNLZ_ZPXTms/pubhtml?gid=451186788&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        vd = findViewById(R.id.vd);

        vd.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vR1sc8hR6qWPPsmD9tjxGhUWDCvIqJDSRmxWHauigop-Y35P40cwOX4xjfuIsjHqAkQtgDv1vihyPM-/pubhtml?gid=2145102293&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p1 = findViewById(R.id.p1);

        p1.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vSpKu8Aa5PwwNuR7yFG4ZlqkPKMvwaLvPQjKDZYRdmH3oYU293WgysoLTWmSGXKGmq8GwS4UzEJa-sQ/pubhtml?gid=1969172852&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        ranking = findViewById(R.id.ranking);

        ranking.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQ1h4cdEY-xt4OlAMl6f2V1ozHCmiSxWJ-dZpbxmAXWyUsTVKop8MCoOL6_Jbc23K1CUNTgaBbKa18D/pubhtml?gid=913564904&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p2 = findViewById(R.id.p2);

        p2.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRQhanwxXDMvdbvjtcKCKWydDPU7w2JFzN2geXqGrc25RpLboWUiLaAq1V8SnMEmX9v_QhqROwP7WWq/pubhtml?gid=235458473&single=true";

            Intent intent = new Intent(ReasonGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
