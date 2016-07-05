package com.sartainstudios.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnItemSelectedListener {

    Spinner spinnerDialog, spinnerDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerDialog = (Spinner) findViewById(R.id.spinner_dialog);
        spinnerDropdown = (Spinner) findViewById(R.id.spinner_dropdown);


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item);
        spinnerDialog.setAdapter(adapter);
        spinnerDialog.setOnItemSelectedListener(MainActivity.this);

        spinnerDropdown.setAdapter(adapter);
        spinnerDropdown.setOnItemSelectedListener(MainActivity.this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView spinnerDialogText = (TextView) view;
        Toast.makeText(this, "you selected " + spinnerDialogText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
