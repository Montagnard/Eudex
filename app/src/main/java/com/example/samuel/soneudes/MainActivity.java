package com.example.samuel.soneudes;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_sound_bonnerep = (Button) findViewById(R.id.btn_bonnerep);
        btn_sound_bonnerep.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.bonnereponse);
            }

        });

        Button btn_sound_consulte = (Button) findViewById(R.id.btn_consulte);
        btn_sound_consulte.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.consulte);
            }

        });

        Button btn_sound_gueudro = (Button) findViewById(R.id.btn_gueudro);
        btn_sound_gueudro.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.guedro);
            }

        });

        Button btn_sound_jardiniere = (Button) findViewById(R.id.btn_jardiniere);
        btn_sound_jardiniere.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.jardiniere);
            }

        });

        Button btn_sound_passe = (Button) findViewById(R.id.btn_passe);
        btn_sound_passe.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.jepasse);
            }

        });

        Button btn_sound_lalala = (Button) findViewById(R.id.btn_lalala);
        btn_sound_lalala.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.lalala2);
            }

        });

        Button btn_sound_92 = (Button) findViewById(R.id.btn_92);
        btn_sound_92.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.lepers92);
            }

        });

        Button btn_sound_regale = (Button) findViewById(R.id.btn_regale);
        btn_sound_regale.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.onseregale);
            }

        });

        Button btn_sound_pasca = (Button) findViewById(R.id.btn_pasca);
        btn_sound_pasca.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.pascadutout);
            }

        });

        Button btn_sound_joursgueudro = (Button) findViewById(R.id.btn_joursgueudro);
        btn_sound_joursgueudro.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.joursguedro);
            }

        });

        Button btn_sound_suuh = (Button) findViewById(R.id.btn_suh);
        btn_sound_suuh.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.suuh);
            }

        });

        Button btn_sound_ttlesjours = (Button) findViewById(R.id.btn_jours);
        btn_sound_ttlesjours.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playSound(R.raw.ttlesjours);
            }

        });
    }

    private MediaPlayer mPlayer = null;

    private void playSound(int resId) {
        if(mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer = MediaPlayer.create(this, resId);
        mPlayer.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
    }

}
