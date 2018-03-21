package com.example.kalani.instacart;
import android.content.Intent;
import android.support.graphics.drawable.AnimationUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class welcome extends AppCompatActivity {
    private Button button1;
    private Button button2;
    LinearLayout ll;
    Button btnlog;
    Button btnsign;
    Animation uptodown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnlog = (Button) findViewById(R.id.buttonlog);
        btnsign = (Button) findViewById(R.id.buttonsign);
        ll = (LinearLayout) findViewById(R.id.ll);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        ll.setAnimation(uptodown);

        button1= (Button) findViewById(R.id.buttonlog);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        button2= (Button) findViewById(R.id.buttonsign);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });


    }
    public void login()
    {
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
    public void signup()
    {
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }
}