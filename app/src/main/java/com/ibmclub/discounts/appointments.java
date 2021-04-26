package com.ibmclub.discounts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class appointments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointments);

    }

public void appoint(View view){

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://form.jotform.com/202966352559364"));
        startActivity(intent);
}


}
