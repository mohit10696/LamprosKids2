package com.example.lamproskids;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class Login extends AppCompatActivity {
    Button login;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login);
        lottieAnimationView = findViewById(R.id.animation_view);
        lottieAnimationView.setVisibility(View.INVISIBLE);
      //  lottieAnimationView.pauseAnimation();
       // lottieAnimationView.playAnimation();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setVisibility(View.INVISIBLE);
                lottieAnimationView.setVisibility(View.VISIBLE);
                lottieAnimationView.playAnimation();
//                Intent i = new Intent(Login.this,Home.class);
//                startActivity(i);
//                Login.this.finish();
            }
        });
    }
}
