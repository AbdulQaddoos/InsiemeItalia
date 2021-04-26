package com.ibmclub.discounts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivityList extends AppCompatActivity {


    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlist);

        lv = (ListView)findViewById(R.id.listView);

        CountryClass[] countries = new CountryClass[]{
                new CountryClass("President", "Ahmed ElGendy",R.drawable.ahmed),
                new CountryClass("", "Via Pietro Bucci,Rende,Cosenza 87036.\nEmail:info.insieme@blu.it\nMobile:+393885843856",R.drawable.test),
//              new CountryClass("President", "Ahmed Mohamed ElGendy",R.drawable.logo),
//                new CountryClass("Vice-President", "Moiz Khan Sherwani",R.drawable.logo),
//                new CountryClass("Member", "Mahmoud Ezzat Kamel Elsayed",R.drawable.logo),
//                new CountryClass("Member", "Abdul Rahman Azeez",R.drawable.logo),
//                new CountryClass("Member", "Ekhlas Ammar",R.drawable.logo),
//                new CountryClass("Member", "Donia Hassan Elaraby",R.drawable.logo),
//                new CountryClass("Member", "Adsvs",R.drawable.logo),
//                new CountryClass("Member", "Ajsjj",R.drawable.logo),

        };

        CountryAdapter adapter = new CountryAdapter(this,R.layout.customlist,countries);
        lv.setAdapter(adapter);
    }
}
