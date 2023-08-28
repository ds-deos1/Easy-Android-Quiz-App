package jdk.rise.mentorquiz;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button quant;
    Button reasoning;
    Button gk;
    Button btn_grades;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#FF6961'>MentorQuiz </font>"));

        quant = findViewById(R.id.quant);

        reasoning = findViewById(R.id.reason);

        gk = findViewById(R.id.gk);

        btn_grades = findViewById(R.id.btn_grades);

        quant.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Quant.class);
            startActivity(intent);

        });

        reasoning.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Reason.class);
            startActivity(intent);

        });

        gk.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), GK.class);
            startActivity(intent);

        });

        btn_grades.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), Grades.class);
            startActivity(intent);

        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.share:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = "Download MentorQuiz:-https://play.google.com/store/apps/details?id=jdk.rise.mentorquiz";
                String shareSubject = "MentorQuiz";
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(shareIntent, "Share Using"));
                return true;
            case R.id.pass_codes:
                Intent intent3 = new Intent(getApplicationContext(), PassCodes.class);
                startActivity(intent3);
                return true;
            case R.id.privacy_policy:
                Intent intent = new Intent(getApplicationContext(), PrivacyPolicy.class);
                startActivity(intent);
                return true;
            case R.id.terms:
                Intent intent1 = new Intent(getApplicationContext(), terms.class);
                startActivity(intent1);
                return true;
            case R.id.about_app:
                Intent intent2 = new Intent(getApplicationContext(), about_app.class);
                startActivity(intent2);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
