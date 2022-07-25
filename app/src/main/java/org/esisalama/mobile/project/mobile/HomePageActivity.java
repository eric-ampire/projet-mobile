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
            SharedPreferences session = getSharedPreferences("session", MODE_PRIVATE);
            boolean sessionActivity = session.getBoolean("session_active", false);

            if (!sessionActivity) {
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);
                finish();
            }
        }
        public void configurerButtonProfils(){
            Button boutonProfile = findViewById(R.id.btn_profile);
            boutonProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent profilIntent = new Intent(HomePageActivity.this, ProfilActivity.class);
                    startActivity(profilIntent);
                }
            });
        }

        public void configurerButtonListeTravail(){
            Button listBouton = findViewById(R.id.btn_liste_travail);
            listBouton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent listIntent = new Intent(HomePageActivity.this, ListeTravailActivity.class);
                    startActivity(listIntent);
                }
            });
        }

        public void configurerButtonAjout(){
            Button butonAjout = findViewById(R.id.btn_ajout_travail);
            butonAjout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ajoutIntent = new Intent(HomePageActivity.this, AjouterTravailActivity.class);
                    startActivity(ajoutIntent);
                }
            });
        }
}