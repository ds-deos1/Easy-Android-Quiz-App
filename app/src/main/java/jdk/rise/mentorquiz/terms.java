package jdk.rise.mentorquiz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class terms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_terms);

        overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );


    }
}