package com.example.miran.multscreen2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenusActivity extends AppCompatActivity {

    Button button;
    Button payment;
    Button artist;
    Button buyAlbumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menus);
        button = (Button) findViewById(R.id.button);
        artist = (Button) findViewById(R.id.artist);
        payment = (Button) findViewById(R.id.payment);
        buyAlbumButton = (Button) findViewById(R.id.buyAlbumButton);
        button.setOnClickListener(klick);
        buyAlbumButton.setOnClickListener(klick);
        artist.setOnClickListener(klick);
        payment.setOnClickListener(klick);
    }
    View.OnClickListener klick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.button:
                    Intent intent = new Intent(MainMenusActivity.this, PlayActivity.class);
                    startActivity(intent);
                    break;
                case R.id.buyAlbumButton:
                    Intent intent1 = new Intent(MainMenusActivity.this, BuyAlbumActivity.class);
                    startActivity(intent1);
                    break;

                case R.id.artist:
                    Intent intent2 = new Intent(MainMenusActivity.this, ArtistActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.payment:
                    Intent intent3 = new Intent(MainMenusActivity.this, PaymentActivity.class);
                    startActivity(intent3);
                    break;
            }
        }
    };
}
