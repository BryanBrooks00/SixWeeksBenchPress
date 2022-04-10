package com.darwin.sixweeksbenchpress;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Day1 extends AppCompatActivity {

    Context context;

    TextView weight1;
    TextView weight2;
    TextView weight3;
    TextView weight4;
    TextView weight5;
    TextView weight6;
    TextView weight7;

    TextView set1;
    TextView set2;
    TextView set3;
    TextView set4;
    TextView set5;
    TextView set6;
    TextView set7;

    TextView rep1;
    TextView rep2;
    TextView rep3;
    TextView rep4;
    TextView rep5;
    TextView rep6;
    TextView rep7;

    Button btn_done;
    public static final String TAG = "MY_LOG";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1);

        context = this;
        double rm = Double.parseDouble(Preferences.getRecord(this));
        Log.i(TAG, "1RM = " + rm);
        weight1 = findViewById(R.id.weight1);
        weight2 = findViewById(R.id.weight2);
        weight3 = findViewById(R.id.weight3);
        weight4 = findViewById(R.id.weight4);
        weight5 = findViewById(R.id.weight5);
        weight6 = findViewById(R.id.weight6);
        weight7 = findViewById(R.id.weight7);

        set1 = findViewById(R.id.set1);
        set2 = findViewById(R.id.set2);
        set3 = findViewById(R.id.set3);
        set4 = findViewById(R.id.set4);
        set5 = findViewById(R.id.set5);
        set6 = findViewById(R.id.set6);
        set7 = findViewById(R.id.set7);

        rep1 = findViewById(R.id.rep1);
        rep2 = findViewById(R.id.rep2);
        rep3 = findViewById(R.id.rep3);
        rep4 = findViewById(R.id.rep4);
        rep5 = findViewById(R.id.rep5);
        rep6 = findViewById(R.id.rep6);
        rep7 = findViewById(R.id.rep7);

        // 1 set
        weight1.setText("" + Math.round(rm / 100 * 50));
        set1.setText("1");
        rep1.setText("5");
        //
        // 2 set
        weight2.setText("" + Math.round(rm / 100 * 60));
        set2.setText("1");
        rep2.setText("4");
        //
        // 3 set
        weight3.setText("" + Math.round(rm / 100 * 70));
        set3.setText("1");
        rep3.setText("3");
        //
        // 4 set
        weight4.setText("" + Math.round(rm / 100 * 80));
        set4.setText("1");
        rep4.setText("2");
        //
        // 5 set
        weight5.setText("" + Math.round(rm / 100 * 90));
        set5.setText("1");
        rep5.setText("1");
        //
        // 6 set
        weight6.setText("" + Math.round(rm / 100 * 95));
        set6.setText("2");
        rep6.setText("1");
        //
        // 7 set
        weight7.setText("" + Math.round(rm / 100 * 85));
        set7.setText("1");
        rep7.setText("3");
        //

        btn_done = findViewById(R.id.btn_done);
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Preferences.setLevel(context, "2");
                startActivity(new Intent(context, ScheduleActivity.class ));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(context, ScheduleActivity.class));
        finish();
    }
}