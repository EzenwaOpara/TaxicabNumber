package com.benjamin.taxicabnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String t1 = "2";
    String t2 = "1729";
    String t3 = "87539319";
    String t4 = "6963472309248.0";
    String t5 = "48988659276962496";
    String t6 = "24153319581254312065344";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.display);
        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t = 0;
                String editTextString = editText.getText().toString().trim();
                if (!(editTextString.isEmpty()))
                    t = Integer.parseInt(editTextString);

                if (editTextString.isEmpty()) {
                    Toast.makeText(MainActivity.this, "You didn't enter any number.", Toast.LENGTH_SHORT).show();
                } else if (t < 1 || t > 6 || editTextString.length() > 1) {
                    Toast.makeText(MainActivity.this, "The number " + t + " is out of range", Toast.LENGTH_SHORT).show();
                } else if (t == 1) {
                    textView.setText("T(" + t + ") = " + t1);
                } else if (t == 2) {
                    textView.setText("T(" + t + ") = " + t2);
                } else if (t == 3) {
                    textView.setText("T(" + t + ") = " + t3);
                } else if (t == 4) {
                    textView.setText("T(" + t + ") = " + t4);
                } else if (t == 5) {
                    textView.setText("T(" + t + ") = " + t5);
                } else if (t == 6) {
                    textView.setText("T(" + t + ") = " + t6);
                }
            }
        });
    }
}
