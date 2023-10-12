package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
//    private ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.img = (ImageView) findViewById(R.id.img);
//        this.img2 = (ImageView) findViewById(R.id.img2);
    }

    public void onSpin(View view) {
        img.animate().rotation(360f).setDuration(2000);
    }

    public void onGrow(View view) {
        img.animate()
                .scaleX(1.2f)
                .scaleY(1.2f)
                .setDuration(2000);
    }

    public void onTeleport(View view) {
        img.animate().alpha(0).setDuration(2000);
    }

    public void onReset(View view) {
        img.setImageResource(R.drawable.simps1);
        img.animate().scaleX(1f).scaleY(1f).alpha(1f);
    }
}