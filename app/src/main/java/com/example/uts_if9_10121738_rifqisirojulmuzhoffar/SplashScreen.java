package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

/*  Tanggal Pengerjaan  : 28 Mei 2023
    Nama                : Rifqi Sirojul Muzhoffar
    NIM                 : 10121738
    Kelas               : IF-9 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), WalkthroughActivity.class));
            finish();
        }, 3000L);
    }
}