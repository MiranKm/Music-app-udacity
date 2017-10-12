package com.example.miran.multscreen2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity extends AppCompatActivity {

    Button goHome;
    ImageButton imageButtonPlay;
    boolean isPlaying = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        imageButtonPlay = (ImageButton) findViewById(R.id.imageButtonPlay);
        goHome = (Button) findViewById(R.id.goHome);
        imageButtonPlay.setOnClickListener(changeIcon);
        goHome.setOnClickListener(changeIcon);
    }
    View.OnClickListener changeIcon = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imageButtonPlay:
                    // playButton   //
                    if (isPlaying)
                        imageButtonPlay.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
                    else
                        imageButtonPlay.setImageResource(R.drawable.ic_play_circle_filled_black_24dp);
                    isPlaying = !isPlaying;
                    //            //
                    break;

                case R.id.goHome:
                    Intent intent = new Intent(PlayActivity.this, MainMenusActivity.class);
                    startActivity(intent);
                    break;
            }
        }

    };
}
