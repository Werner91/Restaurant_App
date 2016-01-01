package de.hs_weingarten.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Bestellung extends AppCompatActivity {

    private List<String> getraenke_bestellung_array;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestellung);

        getraenke_view getraenke_bestellung = new getraenke_view();
        getraenke_bestellung_array = getraenke_bestellung.getBestellungGetraenke();

        //ListAdapter um die Daten mit der ListView zu verbinden
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getraenke_bestellung_array);
        listView = (ListView) findViewById(R.id.bestellung_View);
        listView.setAdapter(adapter);

    }

}
