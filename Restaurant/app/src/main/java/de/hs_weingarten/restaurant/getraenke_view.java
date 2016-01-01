package de.hs_weingarten.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class getraenke_view extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<String> bestellung_getraenke = new ArrayList<String>();

    String[] getraenk;
    ListView _getraenkelistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getraenke_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getraenk = getResources().getStringArray(R.array.getraenke_auswahl);

        //ListAdapter um die Daten mit der ListView zu verbinden
        ListAdapter adapter = ArrayAdapter.createFromResource(this, R.array.getraenke_auswahl, android.R.layout.simple_list_item_1);
        _getraenkelistView = (ListView) findViewById(R.id.getraenkeListView);
        _getraenkelistView.setAdapter(adapter);

        _getraenkelistView.setOnItemClickListener(this);
    }

    public List<String> getBestellungGetraenke(){
        return bestellung_getraenke;
    }

    public void onItemClick(AdapterView<?> lv, View view, int pos, long id) {
        switch (pos) {
            case 0:


                String getraenk_1=getraenk[0];
                bestellung_getraenke.add(getraenk_1);
                Toast.makeText(this, getraenk_1 + " zur Bestellung hinzugefügt", Toast.LENGTH_SHORT).show();
                System.out.println(bestellung_getraenke);
                break;

            case 1:

                String getraenk_2=getraenk[1];
                bestellung_getraenke.add(getraenk_2);
                Toast.makeText(this, getraenk[1] + " zur Bestellung hinzugefügt", Toast.LENGTH_SHORT).show();
                System.out.println(bestellung_getraenke);
                break;

            case 2:
                String getraenk_3=getraenk[2];
                bestellung_getraenke.add(getraenk_3);
                Toast.makeText(this, getraenk[2] + " zur Bestellung hinzugefügt", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                String getraenk_4=getraenk[3];
                bestellung_getraenke.add(getraenk_4);
                Toast.makeText(this, getraenk[3] + " zur Bestellung hinzugefügt", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                String getraenk_5=getraenk[4];
                bestellung_getraenke.add(getraenk_5);
                Toast.makeText(this, getraenk[4] + " zur Bestellung hinzugefügt", Toast.LENGTH_SHORT).show();
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
