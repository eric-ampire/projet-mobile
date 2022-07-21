package org.esisalama.mobile.project.mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_modifier_profile) {
            Toast.makeText(ProfilActivity.this,
                    "vous avez cliquer sur menu",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(
                    ProfilActivity.this,
                    "Vous avez cliquer sur parametre",
                    Toast.LENGTH_LONG
            ).show();

        }
        return super.onOptionsItemSelected(item);
    }

        //ratacher un memnu à une activite
        public boolean onOncreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu_profile,menu);
            return onOncreateOptionsMenu(menu);
        }
    }
