package org.esisalama.mobile.project.mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class  ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_modifier_profile) {
            Toast.makeText(ProfilActivity.this,
                    "vous avez cliquer sur mofier profile",
                    Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, ModifierProfileActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(
                    ProfilActivity.this,
                    "Vous avez cliquer sur parametre",
                    Toast.LENGTH_LONG
            ).show();

        }
        return super.onOptionsItemSelected(item);
    }


    }
