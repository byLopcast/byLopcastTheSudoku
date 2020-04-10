package com.example.andres.bylopcastthesudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    private EditText settingsName;
    private Switch settingsSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        this.settingsName = (EditText)findViewById(R.id.settingsNameStore);
        this.settingsSound = (Switch)findViewById(R.id.settingsSoundSwitch);

        SharedPreferences shaPreferences = getSharedPreferences("sharedpreferences", Context.MODE_PRIVATE);

        this.settingsName.setText(shaPreferences.getString("userName",""));
        this.settingsSound.setChecked(shaPreferences.getBoolean("sound",true));

    }

    // Button Save preferences. Uses the Shared preferences class to store the name of the user and its sound selection.
    public void actionSettingsSave(View view){
        SharedPreferences shaPreferences = getSharedPreferences("sharedpreferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor preferencesEditor = shaPreferences.edit();
        preferencesEditor.putString("userName", this.settingsName.getText().toString());
        preferencesEditor.putBoolean("sound", this.settingsSound.isChecked());

        preferencesEditor.commit();
        finish();

        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();

    }

    // Button Reset. Sets all the Sudokus to status = UNSOLVED.
    public void actionSettingsReset(View view){
        Toast.makeText(this, "Reset pressed.", Toast.LENGTH_SHORT).show();
    }

}
