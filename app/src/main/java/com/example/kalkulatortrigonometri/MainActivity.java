package com.example.kalkulatortrigonometri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnsin,btncos,btntan,btncsc,btnsec,btncot,btnlog;
    private TextView tvHasil;
    private EditText InputAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsin = findViewById(R.id.sin);
        btncos = findViewById(R.id.cos);
        btntan = findViewById(R.id.tan);
        btncsc = findViewById(R.id.cosec);
        btnsec = findViewById(R.id.sec);
        btncot = findViewById(R.id.cotan);
        btnlog = findViewById(R.id.log);
        tvHasil =findViewById(R.id.tv_hasil);
        InputAngka  = findViewById(R.id.angka);

        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputAngka = InputAngka.getText().toString();
                    double dInputAngka = Double.parseDouble(sInputAngka);

                    double hasil = Math.sin(dInputAngka);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputAngka = InputAngka.getText().toString();
                    double dInputAngka = Double.parseDouble(sInputAngka);

                    double hasil = Math.cos(dInputAngka);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputAngka = InputAngka.getText().toString();
                    double dInputAngka = Double.parseDouble(sInputAngka);

                    double hasil = Math.tan(dInputAngka);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputAngka = InputAngka.getText().toString();
                    double dInputAngka = Double.parseDouble(sInputAngka);

                    double hasil = 1/Math.sin(dInputAngka);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputAngka = InputAngka.getText().toString();
                    double dInputAngka = Double.parseDouble(sInputAngka);

                    double hasil = 1/Math.cos(dInputAngka);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputAngka = InputAngka.getText().toString();
                    double dInputAngka = Double.parseDouble(sInputAngka);

                    double hasil = 1/Math.tan(dInputAngka);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputAngka = InputAngka.getText().toString();
                    double dInputAngka = Double.parseDouble(sInputAngka);

                    double hasil = Math.log10(dInputAngka);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

}
