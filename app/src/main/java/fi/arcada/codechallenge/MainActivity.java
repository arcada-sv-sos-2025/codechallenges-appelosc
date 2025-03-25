package fi.arcada.codechallenge;

import static fi.arcada.codechallenge.statistics.calcMean;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Double> values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate();
            }
        });


        values = new ArrayList<>();

        values.add(5.5);
        values.add(5.5);
        values.add(5.5);

        TextView medelvarde = (TextView)findViewById(R.id.medel);
        double mean = statistics.calcMean(values);
        String str = Double.toString(mean);
        medelvarde.setText(str);



    }
    public void Calculate(){

    }








}