package org.esisalama.mobile.project.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;


public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //creation de la session
        SharedPreferences session = getSharedPreferences("session", 0);

        boolean sessionActivity = session.getBoolean("sessionActivity", false);
        int userId = session.getInt("session_Id", -1);

        if (!sessionActivity){
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }


//
//        session.edit().putInt("session_id", 123);
//        session.edit().putBoolean("session_active", true);
//        session.edit().commit();
//
//        session.edit().putInt("session_activity", false);
    }
}