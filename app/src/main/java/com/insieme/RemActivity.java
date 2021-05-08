package com.insieme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.insieme.manager.DB;
import com.insieme.manager.Person;

import java.util.ArrayList;
import java.util.List;

public class RemActivity extends AppCompatActivity {

    List<Person> people;
    DatabaseReference ref;
    EditText codeCase;
    ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rem);
        ref = FirebaseDatabase.getInstance().getReference().child("People");
        people = new ArrayList<>();
        codeCase = findViewById(R.id.codeCase);
        spinner = findViewById(R.id.spinner);
        spinner.setVisibility(View.INVISIBLE);
    }


    public void getStatus(View view) {
        final String codice = codeCase.getText().toString();
        if (codice.isEmpty()){
            codeCase.setError("Codice Richiesto");
        }
        else {
            spinner.setVisibility(View.VISIBLE);
            ref.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()) {
                        people.clear();
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                            Person person = dataSnapshot.getValue(Person.class);
                            people.add(person);
                        }
                        Person person = DB.getPerson(codice.toLowerCase(), people);

                        Intent intent = new Intent(RemActivity.this, RemInfo.class);
                        if(person != null){
                            intent.putExtra("codice_fiscale", person.getCodice_fiscale());
                            intent.putExtra("nome", person.getNome());
                            intent.putExtra("protocollo_INPS", person.getProtocollo_INPS());
                            intent.putExtra("data_present", person.getData_present());
                            intent.putExtra("stato_domanda", person.getStato_domanda());
                            intent.putExtra("data_acquisizione", person.getData_acquisizione());
                            intent.putExtra("data_accoglimento", person.getData_accoglimento());
                        }
                        spinner.setVisibility(View.INVISIBLE);
                        RemActivity.this.startActivity(intent);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        }
    }
}