package com.example.miran.multscreen2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtistActivity extends AppCompatActivity {

    Button goHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        goHome =(Button) findViewById(R.id.goHome);
        goHome.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
            case R.id.goHome:
            Intent intent = new Intent(ArtistActivity.this, MainMenusActivity.class);
            startActivity(intent);
            break;
            }
        }
    };
}
