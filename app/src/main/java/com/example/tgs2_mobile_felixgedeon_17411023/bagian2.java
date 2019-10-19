package com.example.tgs2_mobile_felixgedeon_17411023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bagian2 extends AppCompatActivity {
    TextView txtNama;
    TextView txtNpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagian2);

        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtNama = (TextView) findViewById(R.id.txtNama);

        Intent datas = getIntent();
        String npm = datas.getStringExtra("npm");
        String nama = datas.getStringExtra("nama");

        txtNpm.setText("NPM : " + npm);
        txtNama.setText("NAMA : " + nama);

    }
    @Override
    public void onBackPressed(){
        Intent back = new Intent(bagian2.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}