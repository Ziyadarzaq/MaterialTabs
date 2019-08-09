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

public class PersegiP extends AppCompatActivity {
    private Toolbar toolbar;
    int panj;
    int lebar;
    EditText number1, number2, number3, number4;
    TextView hasil, hasil1;
    String luas1, luas2, kel1, kel2;
    Button luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_p);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Persegi Panjang");
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);
        number4 = findViewById(R.id.number4);
        hasil = findViewById(R.id.hasil);
        hasil1 = findViewById(R.id.hasil1);
        luas = findViewById(R.id.luas);
        keliling = findViewById(R.id.keliling);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String luas1 = number1.getText().toString();
                String luas2 = number2.getText().toString();

                if (luas1.equalsIgnoreCase("") || luas1.trim().isEmpty() || luas2.equalsIgnoreCase("") || luas2.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    int lebar, panj, hasill1;
                    panj = Integer.parseInt(number1.getText().toString());
                    lebar = Integer.parseInt(number2.getText().toString());
                    hasill1 = panj * lebar;
                    hasil.setText(String.valueOf(hasill1));


                }
            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kel1 = number3.getText().toString();
                String kel2 = number4.getText().toString();
                if (kel1.equalsIgnoreCase("") || kel1.trim().isEmpty() || kel2.equalsIgnoreCase("") || kel2.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    int lebar, panj, hasil2;
                    panj = Integer.parseInt(number3.getText().toString());
                    lebar = Integer.parseInt(number4.getText().toString());
                    hasil2 = (panj + lebar) * 2;
                    hasil1.setText(String.valueOf(hasil2));
                }
            }
        });
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
