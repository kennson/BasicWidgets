package com.mobility.dictwilson.basicwidgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button= (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this,MainActivity.class));
            }
        });

        TextView textView = (TextView) findViewById(R.id.textView);
        Bundle bundle;
        bundle = getIntent().getExtras();
        textView.setText(bundle.getString(""));
    }
}
