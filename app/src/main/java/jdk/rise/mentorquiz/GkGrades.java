package jdk.rise.mentorquiz;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class GkGrades extends AppCompatActivity {

    Button p1;
    Button p2;
    Button p3;
    Button p4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#00BCD4'>GK Grades</font>"));

        setContentView(R.layout.gk_grades);

        p1 = findViewById(R.id.p1);

        p1.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQ0yU8qnFj-b8iyDNY3o8XcT5swzSdXOF4R4XrKii5vYejXSFHwPzJzbV3K9Ez3xpHEUd4G-fKX5lF8/pubhtml?gid=1381911743&single=true";

            Intent intent = new Intent(GkGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p2 = findViewById(R.id.p2);

        p2.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQKQHmA93sYsmrptQ9cmOb1Cy3Z2MbffEmUAkLKc4pdRhveLXLSdFai2peNVSK2jCDllACjVM7qwv9G/pubhtml?gid=830080534&single=true";

            Intent intent = new Intent(GkGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p3 = findViewById(R.id.p3);

        p3.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRr4tyQkiolLzrV2tAjhVXUu0ZZZw-qb7ywbEnQlUHCF3LBabB6qV4d0qBJK7Z7jkg8st3TAnusjTiC/pubhtml?gid=635158147&single=true";

            Intent intent = new Intent(GkGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

        p4 = findViewById(R.id.p4);

        p4.setOnClickListener(view -> {

            String webUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vQtL63Q6YtEOGyhalrpoV1RDokraXebq31GvhmabquAw7JqKUUs1vpHsCtl3RSTNscphd9yD8FYECDX/pubhtml?gid=1909733477&single=true";

            Intent intent = new Intent(GkGrades.this, Exam.class);

            intent.putExtra("webUrl", webUrl);

            startActivity(intent);

        });

    }
}
