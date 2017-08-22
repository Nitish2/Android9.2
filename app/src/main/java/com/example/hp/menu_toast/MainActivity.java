package com.example.hp.menu_toast;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Creating onCreateOptionsMenu method().
     * In this method, you can inflate your menu resource into the Menu provided in the callback.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater() method will Inflate a menu hierarchy from the specified XML resource.
        getMenuInflater().inflate(R.menu.toast_menu, menu);
        return true;
    }

    /**
     * Creating onOptionsItemSelected() method.
     * This method passes the MenuItem selected.
     * You can identify the item by calling getItemId() method,
        which returns the unique ID for the menu item .
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem color) {
        switch (color.getItemId()) { // Creating Switch Case for item selection from the menu

            // Giving Toast message to each item in the menu by its item ID .
            case R.id.comp:
                Toast.makeText(getApplicationContext(), "You have clicked Computer",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.pad:
                Toast.makeText(getApplicationContext(), "You have clicked Gamepad",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.cam:
                Toast.makeText(getApplicationContext(), "You have clicked Camera",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.video:
                Toast.makeText(getApplicationContext(),"You have clicked Video",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.mail:
                Toast.makeText(getApplicationContext(),"You have clicked E Mail",
                        Toast.LENGTH_LONG).show();
                return true;
            default:
                return true;
        }
    }
}
