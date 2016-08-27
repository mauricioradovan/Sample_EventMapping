package com.mradovan.Sample_EventMapping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnBottomRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBottomRight = (Button) findViewById(R.id.btnBottomRight);
        btnBottomRight.setOnClickListener(new EventOnClick(this));
    }

}
