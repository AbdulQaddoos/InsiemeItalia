package com.insieme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.insieme.manager.Person;


public class RemInfo extends AppCompatActivity {

    TextView infoText;
    ImageView wtsp;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rem_info);

        infoText = findViewById(R.id.rem_info);
        wtsp = findViewById(R.id.wtsp);
        person = new Person();

        person.setCodice_fiscale(getIntent().getStringExtra("codice_fiscale"));
        person.setNome(getIntent().getStringExtra("nome"));
        person.setProtocollo_INPS(getIntent().getStringExtra("protocollo_INPS"));
        person.setStato_domanda(getIntent().getStringExtra("stato_domanda"));

        if(person.getCodice_fiscale() == null){
            infoText.setText("You are not in our Archives. please contact the Administrator:\n\n3885843856");
            wtsp.setVisibility(View.VISIBLE);
        }
        else{
            infoText.setText(person.toString());
        }
    }

    public void whatsapp(View view) {
        Uri uri = Uri.parse("https://wa.me/+393885843856/?text=I%20COULDN'T%20FIND%20MY%20REM%20REQUEST%20PLEASE%20CHECK%20IT");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
