package com.example.miran.multscreen2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BuyAlbumActivity extends AppCompatActivity {

    Button goHome;
    ImageButton buyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_album);
        goHome =(Button) findViewById(R.id.goHome);
        buyBtn =(ImageButton) findViewById(R.id.buyBtn);
        goHome.setOnClickListener(clickListener);
        buyBtn.setOnClickListener(clickListener);

    }
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.goHome:
                    Intent intent = new Intent(BuyAlbumActivity.this, MainMenusActivity.class);
                    startActivity(intent);
                    break;
                case R.id.buyBtn:
                    Intent intent2 = new Intent(BuyAlbumActivity.this, PaymentActivity.class);
                    startActivity(intent2);

            }

        }
    };


}
