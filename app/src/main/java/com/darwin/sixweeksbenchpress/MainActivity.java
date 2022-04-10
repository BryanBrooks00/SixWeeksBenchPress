package com.darwin.sixweeksbenchpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LOG";
    EditText rm_et;
    Button btn_start;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        rm_et = findViewById(R.id.rm_et);

        if (checkRm()){
            startActivity(new Intent(context, ScheduleActivity.class));
        }

        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!rm_et.getText().toString().equals(null) && !rm_et.getText().toString().equals("")){
                    saveRm(rm_et.getText().toString());
                    startActivity(new Intent(context, ScheduleActivity.class));
                    finish();
                } else{
                    Toast.makeText(context, getResources().getString(R.string.empty), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void saveRm(String rm){
        Preferences.setRecord(context, rm);
    }

    public boolean checkRm(){
        return !Preferences.getRecord(context).equals("") && Preferences.getRecord(context) != null;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
