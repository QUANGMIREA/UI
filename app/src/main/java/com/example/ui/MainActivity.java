package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = findViewById(R.id.imageView1);



        ImageView imageView2 = findViewById(R.id.imageView2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator rotateAnim = ObjectAnimator.ofFloat(imageView1, "rotation", 0f, 360f);
                rotateAnim.setDuration(2000);
                rotateAnim.setRepeatCount(ObjectAnimator.INFINITE);
                rotateAnim.setRepeatMode(ObjectAnimator.RESTART);
                rotateAnim.start();
                ObjectAnimator moveAnim = ObjectAnimator.ofFloat(imageView2, "translationX", 0f, 300f);
                moveAnim.setDuration(1000);
                moveAnim.start();
            }
        });
    }
}