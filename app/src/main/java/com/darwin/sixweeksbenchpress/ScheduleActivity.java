package com.darwin.sixweeksbenchpress;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ScheduleActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn_recommendation;
    Context context;

    public static final int MAX = 12;
    int lvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_activity);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn_recommendation = findViewById(R.id.btn_recommendation);

        context = this;
        lvl = Integer.parseInt(Preferences.getLevel(this));;

        denyAccess();
        //allowAccess();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day1.class));
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day2.class));
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day3.class));
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day4.class));
                finish();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day5.class));
                finish();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day6.class));
                finish();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day7.class));
                finish();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day8.class));
                finish();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day9.class));
                finish();
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day10.class));
                finish();
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day11.class));
                finish();
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this, Day12.class));
                finish();
            }
        });


    }

    public void denyAccess() {
        if (lvl < MAX) {
            for (lvl = lvl + 1; lvl <= MAX; lvl++) {
                int id = getResources().getIdentifier("btn" + lvl, "id", getPackageName());
                Button btn = findViewById(id);
                btn.setBackgroundColor(ContextCompat.getColor(context, R.color.redTint));
                btn.setEnabled(false);
            }
        }

        btn_recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.recommendation), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ScheduleActivity.this, MainActivity.class));
        finish();
    }
}