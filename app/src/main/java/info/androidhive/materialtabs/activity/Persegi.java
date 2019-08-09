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

public class Persegi extends AppCompatActivity {
    private Toolbar toolbar;
    int sisi;
    int has;
    EditText number1;
    String kel, luas1;
    TextView hasil;
    Button luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Persegi");
        number1 = findViewById(R.id.number1);
        hasil = findViewById(R.id.hasil);
        luas = findViewById(R.id.luas);
        keliling = findViewById(R.id.keliling);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kel = number1.getText().toString();

                if (kel.equalsIgnoreCase("") || kel.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    int sisi, hasill;
                    sisi = Integer.parseInt(number1.getText().toString());
                    hasill = 4 * sisi;
                    hasil.setText(String.valueOf(hasill));


                }
            }
        });
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String luas1 = number1.getText().toString();

                if (luas1.equalsIgnoreCase("") || luas1.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    int sisi, hasill;
                    sisi = Integer.parseInt(number1.getText().toString());
                    hasill = sisi * sisi;
                    hasil.setText(String.valueOf(hasill));
                }
            }
        });

    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;    }
}
