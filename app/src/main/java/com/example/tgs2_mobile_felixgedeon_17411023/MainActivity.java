package com.example.tgs2_mobile_felixgedeon_17411023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    EditText edtNpm;
    EditText edtNama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String npm = edtNpm.getText().toString();
                String nama = edtNama.getText().toString();

                Intent next = new Intent(MainActivity.this,bagian2.class);
                next.putExtra("npm", npm);
                next.putExtra("nama",nama);
                startActivity(next);
                finish();
            }
        });
    }
}