package org.esisalama.mobile.project.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        verifierSession();
        configurerButtonProfils();
        configurerButtonAjout();
        configurerButtonListeTravail();

        }

        public void verifierSession() {
            //creation de la session
            SharedPreferences session = getSharedPreferences("session", 0);

            boolean sessionActivity = session.getBoolean("sessionActivity", false);
            int userId = session.getInt("session_Id", -1);

            if (!sessionActivity) {
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);
                finish();
            }

            //session.edit().putInt("session_id", 123);
//        session.edit().putBoolean("session_active", true);
//        session.edit().commit();
//
//        session.edit().putInt("session_activity", false);
        }
        public void configurerButtonProfils(){
            Button boutonProfile = findViewById(R.id.boutonProfile);
            boutonProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent profilIntent = new Intent(HomePageActivity.this, ProfilActivity.class);
                }
            });
        }

        public void configurerButtonListeTravail(){
            Button listBouton = findViewById(R.id.boutonListedoc);
            listBouton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent listIntent = new Intent(HomePageActivity.this, ListeTravailActivity.class);
                }
            });
        }

        public void configurerButtonAjout(){
            Button butonAjout = findViewById(R.id.boutonAjoutDoc);
            butonAjout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ajoutIntent = new Intent(HomePageActivity.this, AjouterTravailActivity.class);
                }
            });
        }
}