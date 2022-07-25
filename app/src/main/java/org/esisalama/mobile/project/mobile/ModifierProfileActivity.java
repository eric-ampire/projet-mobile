package org.esisalama.mobile.project.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Modifier;
import java.util.Locale;

public class ModifierProfileActivity extends AppCompatActivity {
    private EditText edittext_password_anccien;
    private EditText editText_password_nouveau;
    private EditText getEditText_password_confirmer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_profile);
        EditText ancienM = findViewById(R.id.edittext_password_ancien);
        EditText nouveauM = findViewById(R.id.edittext_password_nouveau);
        EditText confirmerM = findViewById(R.id.edittext_password_confirmer);

        Button modifier = findViewById(R.id.modfier);

        modifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ancien =  ancienM.getText().toString();
                String nouveau = nouveauM.getText().toString();
                String confirmer = confirmerM.getText().toString();
                String matricule = "18KK171";
                if (ancien.equals(matricule) || ancien.equals(matricule.toLowerCase(Locale.ROOT))){
                    if (nouveau.length() >= 4){
                        if (nouveau.equals(confirmer))
                        {
                            Intent intent = new Intent(ModifierProfileActivity.this, HomePageActivity.class);
                            startActivity(intent);
                            finish();
                        }else
                        {
                            Toast.makeText(
                                    ModifierProfileActivity.this,
                                    "Mot de passe different!",
                                    Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(
                                ModifierProfileActivity.this,
                                "Mot de passe court!",
                                Toast.LENGTH_LONG
                        ).show();
                    }
                }else
                {
                    Toast.makeText(
                            ModifierProfileActivity.this,
                            "Ancien mot de passe invalide!",
                            Toast.LENGTH_LONG
                    ).show();
                }


            }
        });
    }
}
