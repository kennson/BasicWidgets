package com.mobility.dictwilson.basicwidgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);

        ImageButton imagebutton= (ImageButton) findViewById(R.id.imageButton);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                Intent intent = new Intent ( getApplicationContext(),Main2Activity.class );
                intent.putExtra ( "", editText.getText().toString() );
                startActivity(intent);
            }
        });

        ImageButton imagebutton2= (ImageButton) findViewById(R.id.imageButton2);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main3Activity.class));
                Intent intent2 = new Intent ( getApplicationContext(),Main3Activity.class );
                intent2.putExtra ( "", editText.getText().toString() );
                startActivity(intent2);
            }
        });

    }
}
