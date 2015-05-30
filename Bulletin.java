package com.example.pengabear.skokietalk;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Bulletin extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulletin);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bulletin, menu);
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

    public void addCal(View v){

        ContentValues event = new ContentValues();
        event.put("calendar_id", 1);
        event.put("title", "Appathon");
        event.put("description", "Appathon From 9AM to 6PM");
        event.put("eventLocation", "Skokie Library");
        event.put("eventStatus", 1);
        event.put("visibility", 3);
        event.put("allDay", 1);
    }

    public void detail (View v) {

        Intent intent = new Intent(this, Details.class);
        this.startActivity(intent);

    }

    public void discuss (View v) {

        Intent intent = new Intent(this, Discuss.class);
        this.startActivity(intent);

    }
}
