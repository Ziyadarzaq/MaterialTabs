package info.androidhive.materialtabs.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Segitiga extends AppCompatActivity {

    private Toolbar toolbarr;
    int alas;
    int sisisi;
    int tinggi;
    int has;
    int hasill;
    String kel, kel2, kel3, luas1, luas2;
    EditText number1, number2, number3, number4, number5;
    TextView hasil, txt_hasill;
    Button luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        toolbarr = (Toolbar) findViewById(R.id.toolbarr);
        setSupportActionBar(toolbarr);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Segitiga");
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        number5 = findViewById(R.id.number5);
        hasil = findViewById(R.id.hasil);
        txt_hasill = findViewById(R.id.txt_hasill);
        luas = findViewById(R.id.luas);
        keliling = findViewById(R.id.keliling);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kel = number3.getText().toString();
                String kel2 = number4.getText().toString();
                String kel3 = number5.getText().toString();

                if (kel.equalsIgnoreCase("") || kel.trim().isEmpty() || kel2.equalsIgnoreCase("") || kel2.trim().isEmpty() ||
                        kel3.equalsIgnoreCase("") || kel3.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    int sisi, sisis, sisisi, hasill;
                    sisi = Integer.parseInt(number3.getText().toString());
                    sisis = Integer.parseInt(number4.getText().toString());
                    sisisi = Integer.parseInt(number5.getText().toString());
                    hasill = sisi + sisis + sisisi;
                    txt_hasill.setText(String.valueOf(hasill));


                }
            }
        });
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String luas1 = number1.getText().toString();
                String luas2 = number2.getText().toString();
                if (luas1.equalsIgnoreCase("") || luas1.trim().isEmpty() || luas2.equalsIgnoreCase("") || luas2.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    int alas, tinggi, hasil1;
                    alas = Integer.parseInt(number1.getText().toString());
                    tinggi = Integer.parseInt(number2.getText().toString());
                    hasil1 = (alas * tinggi) / 2;
                    hasil.setText(String.valueOf(hasil1));
                }


            }
        });

    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}