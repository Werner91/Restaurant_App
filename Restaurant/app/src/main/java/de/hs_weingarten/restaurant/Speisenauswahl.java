package de.hs_weingarten.restaurant;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Speisenauswahl extends AppCompatActivity implements AdapterView.OnItemClickListener{


   //private String[] kategorie_auswahl_list = new String[]{"Getränke", "Vorspeise", "Hauptgang", "Nachtisch"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speisenauswahl);

        //Intent kategorie_auswahl = getIntent();



        listView = (ListView) findViewById(R.id.listView_speisekarte);

        //ListAdapter um die Daten mit der ListView zu verbinden
        ListAdapter adapter = ArrayAdapter.createFromResource (getApplicationContext(), R.array.kategorie_auswahl, android.R.layout.simple_list_item_1); //Daten aus der string.xml laden
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }


    public void onItemClick(AdapterView<?> lv, View view, int pos, long id) {
        switch (pos) {
            case 0:
                Intent getraenke_view_intent = new Intent(this, getraenke_view.class);
                //getraenke_view_intent.setClassName(getPackageName(), getraenke_view);
                startActivity(getraenke_view_intent);
                break;
            case 1:
                Intent vorspeisen_view_intent = new Intent(this, vorspeise_view.class);
                startActivity(vorspeisen_view_intent);
                break;
            case 2:
                 //
                break;
            case 3:
                 //
                break;
        }
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bestellung_icon, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_restaurant:
                Intent bestellung_view_intent = new Intent(this, Bestellung.class);
                //getraenke_view_intent.setClassName(getPackageName(), getraenke_view);
                startActivity(bestellung_view_intent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
