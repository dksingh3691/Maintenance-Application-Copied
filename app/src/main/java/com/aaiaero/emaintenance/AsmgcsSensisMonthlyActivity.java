package com.aaiaero.emaintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.ByteArrayOutputStream;

public class AsmgcsSensisMonthlyActivity extends AppCompatActivity {

    Button smr, processor, ru6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmgcs_sensis_monthly);

        setTitle("MONTHLY SENSIS ASMGCS Maintenance");

        smr = (Button) findViewById(R.id.smr);
        processor = (Button) findViewById(R.id.processor);
        ru6 = (Button) findViewById(R.id.ru6);


        Intent intent = getIntent();

    }

    public void smrClicked (View view){

        Intent intent = new Intent(getApplicationContext(),AsmgcsSmrSensisMonthlyActivity.class);
        startActivity(intent);


    }
    public void processorClicked (View view){
        Intent intent = new Intent(getApplicationContext(),AsmgcsProcessorsSensisMonthlyActivity.class);
        startActivity(intent);


    }

    public void ru6Clicked (View view){
        Intent intent = new Intent(getApplicationContext(),AsmgcsRu6SensisWeeklyActivity.class);
        startActivity(intent);


    }
}
