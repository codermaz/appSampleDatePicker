package com.example.wpro.appsampledatepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
        Button zeigDatumButton = (Button) findViewById(R.id.button);

        //click event on submit button
        zeigDatumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = "Day = " + datePicker.getDayOfMonth();
                String month = "Month = " + (datePicker.getMonth() + 1);
                String year = "Year = " + datePicker.getYear();
                // Gets or sets the day that is considered the beginning of the week.
                String firstDayofWeek = "First Day of Week " + datePicker.getFirstDayOfWeek();

                

                Toast.makeText(getApplicationContext(),
                        day + "\n" + month + "\n" + year + "\n" + firstDayofWeek,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
