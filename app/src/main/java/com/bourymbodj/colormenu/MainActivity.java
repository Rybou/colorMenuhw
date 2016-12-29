package com.bourymbodj.colormenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl= (RelativeLayout) findViewById(R.id.background);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                rl.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "Red background is Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.blue:
                rl.setBackgroundColor(Color.BLUE);
                Toast.makeText(getApplicationContext(), "Blue background is Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.yellow:
                rl.setBackgroundColor(Color.YELLOW);
                Toast.makeText(getApplicationContext(), "Yellow background is Selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
