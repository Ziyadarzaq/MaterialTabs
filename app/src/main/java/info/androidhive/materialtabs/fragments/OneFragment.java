package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment {
    EditText txtangka1, txtangka2;
    TextView txthasil;
    Button btntambah, btnkali, btnkurang, btnbagi;
    double angka1, angka2, hasil;
    String sangka1, sangka2;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_one, container, false);
        txtangka1 = view.findViewById(R.id.txtangka1);
        txtangka2 = view.findViewById(R.id.txtangka2);
        btntambah = view.findViewById(R.id.btntambah);
        btnkali = view.findViewById(R.id.btnkali);
        btnkurang = view.findViewById(R.id.btnkurang);
        btnbagi = view.findViewById(R.id.btnbagi);
        txthasil = view.findViewById(R.id.txthasil);


        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    double sangka1, sangka2, hasill;
                    sangka1 = Double.parseDouble(txtangka1.getText().toString());
                    sangka2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = sangka1 + sangka2;
                    txthasil.setText("Hasil dari " + sangka1 + "+" + sangka2 + "=" + hasill);


                }
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    double sangka1, sangka2, hasill;
                    sangka1 = Double.parseDouble(txtangka1.getText().toString());
                    sangka2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = sangka1 - sangka2;
                    txthasil.setText("Hasil dari " + sangka1 + "+" + sangka2 + "=" + hasill);


                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    double sangka1, sangka2, hasill;
                    sangka1 = Double.parseDouble(txtangka1.getText().toString());
                    sangka2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = sangka1 * sangka2;
                    txthasil.setText("Hasil dari " + sangka1 + "+" + sangka2 + "=" + hasill);


                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "Silahkan Masukan Angka", Toast.LENGTH_SHORT).show();
                } else if (angka1.equalsIgnoreCase("0") || angka2.equalsIgnoreCase("0")) {
                    Toast.makeText(getContext(), "Pembagian Tidak Bisa 0", Toast.LENGTH_LONG).show();
                } else {
                    double sangka1, sangka2, hasill;
                    sangka1 = Double.parseDouble(txtangka1.getText().toString());
                    sangka2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = sangka1 / sangka2;
                    txthasil.setText("Hasil dari " + sangka1 + "+" + sangka2 + "=" + hasill);


                }
            }
        });


        return view;
    }

}
