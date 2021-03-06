package com.example.pengabear.skokietalk;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Discuss extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discuss);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_discuss, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void events (View v) {

        Intent intent = new Intent(this, Events.class);
        this.startActivity(intent);

    }

    public void pois (View v) {

        Intent intent = new Intent(this, POI.class);
        this.startActivity(intent);

    }

    public void petitions (View v) {

        Intent intent = new Intent(this, Petitions.class);
        this.startActivity(intent);

    }

    public void backDiscuss (View v) {

        Intent intent = new Intent(this, Bulletin.class);
        this.startActivity(intent);

    }
}
