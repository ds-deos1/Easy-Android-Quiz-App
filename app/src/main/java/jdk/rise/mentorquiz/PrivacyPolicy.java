package jdk.rise.mentorquiz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PrivacyPolicy extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.privacy_policy);

        overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
    }


}
