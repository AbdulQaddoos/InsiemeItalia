package com.insieme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class appointments extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointments);

    }

public void appoint(View view){

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.insiemeitalia.com/book-an-appointment.html"));
        startActivity(intent);
}


}
