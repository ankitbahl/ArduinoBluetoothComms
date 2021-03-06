package com.example.ankit.arduinobluetoothcomms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent bluetoothIntent = new Intent(this, BluetoothActivity.class);
        startActivityForResult(bluetoothIntent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_CANCELED) {
            Intent bluetoothIntent = new Intent(this, BluetoothActivity.class);
            startActivityForResult(bluetoothIntent, 0);
        }
    }
}
