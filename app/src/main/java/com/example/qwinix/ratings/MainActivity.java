package com.example.qwinix.ratings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mLogbtn;
    private Sharedconfig preferenceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogbtn=(Button)findViewById(R.id.logbtn);
        mLogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preferenceConfig.writeLoginStatus(false);
                Intent toy1 = new Intent(MainActivity.this, Main2Activity.class);

                startActivity(toy1);
                finish();


            }
        });
    }
}
