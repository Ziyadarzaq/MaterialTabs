package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Persegi;
import info.androidhive.materialtabs.activity.PersegiP;
import info.androidhive.materialtabs.activity.Segitiga;


public class TwoFragment extends Fragment{
Button Persegi,PersegiP,Segitiga;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View look= inflater.inflate(R.layout.fragment_two, container, false);
        Persegi = look.findViewById(R.id.Persegi);
        PersegiP = look.findViewById(R.id.PersegiP);
        Segitiga = look.findViewById(R.id.Segitiga);
        Persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Persegi.class);
            }
        });

        Segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(Segitiga.class);
            }
        });
        PersegiP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(PersegiP.class);

            }
        });
        return look;
    }
public void open(Class saya){
    Intent in = new Intent(getActivity(),saya);
    startActivity(in);
    }

}
