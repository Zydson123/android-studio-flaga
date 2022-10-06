package com.example.helloworld3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int ileDobrychKliknietych;
    public int ileDoWygranej;
    public boolean czyWygrana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ileDobrychKliknietych = 0;
        ileDoWygranej=5;
        czyWygrana=false;
    }

    public void zle(View view) {
        if(!czyWygrana){
            Toast.makeText(MainActivity.this, R.string.zleZaznaczone, Toast.LENGTH_SHORT).show();
        }
    }

    public void dobrze(View view) {
        ileDobrychKliknietych++;
        view.setVisibility(view.INVISIBLE);
        if(ileDobrychKliknietych==ileDoWygranej){
            Toast.makeText(MainActivity.this, R.string.wygranaGra, Toast.LENGTH_SHORT).show();
            czyWygrana=true;

        }
        else{
            Toast.makeText(MainActivity.this, R.string.dobrzeZaznaczone, Toast.LENGTH_SHORT).show();
        }

    }
}