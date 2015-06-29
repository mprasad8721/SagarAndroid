package com.example.rajendraprasad.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity" , "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity" , "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity" , "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity" , " onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity" , "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity" , "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity" , "onDestroy");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}

