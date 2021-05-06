package com.insieme;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.insieme.manager.Person;


public class RemInfo extends AppCompatActivity {

    TextView infoText;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rem_info);

        infoText = findViewById(R.id.rem_info);
        person = new Person();

        person.setCodice_fiscale(getIntent().getStringExtra("codice_fiscale"));
        person.setNome(getIntent().getStringExtra("nome"));
        person.setProtocollo_INPS(getIntent().getStringExtra("protocollo_INPS"));
        person.setStato_domanda(getIntent().getStringExtra("stato_domanda"));

        if(person.getCodice_fiscale() == null){
            infoText.setText("You are not in our Archives.please contact the Administrator:\n\n3885843856");
        }
        else{
            infoText.setText(person.toString());
        }
    }
}