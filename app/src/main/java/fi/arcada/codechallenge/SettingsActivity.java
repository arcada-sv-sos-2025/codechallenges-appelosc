package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;

import com.google.android.material.textfield.TextInputEditText;

public class SettingsActivity extends AppCompatActivity {
    private Button resetButton;

    private Button saveInput;
    private SharedPreferences sharedPreferences;

    private SharedPreferences updateText;

    // Återanvänd koden i MainActivity, så vi använder samma sharedPreference fil och "räknare"
    private static final String PREFS_NAME = "AppCounterPrefs";

    private static final String TEXT_INPUT = "TextInput";
    private static final String APP_COUNTER_KEY = "appCounter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        // Helt vanlig knapp som vi hittar
        // På knappen sätter vi funktionen att nolla vår räknare
        // - Samma sätt som vi uppdatera den, kan vi sätta den till noll
        // --- Man kan göra om denna knapp till Spara knappen!

        resetButton = findViewById(R.id.resetButton);

        TextInputEditText Text =(TextInputEditText) findViewById(R.id.textInput);

        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        updateText = getSharedPreferences(TEXT_INPUT, MODE_PRIVATE);

        saveInput = findViewById(R.id.saveInput);

        saveInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = updateText.edit();
                editor.putString(TEXT_INPUT, Text.getText().toString());
                editor.apply();
            }
        });



        resetButton.setOnClickListener(v -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt(APP_COUNTER_KEY, 0);
            editor.apply();
        });
    }
}
