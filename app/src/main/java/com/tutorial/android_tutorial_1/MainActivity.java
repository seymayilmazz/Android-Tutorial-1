package com.tutorial.android_tutorial_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button tikla1Button;
    private Button tikla2Button;

    private TextView mesajTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* aktivitenin layout dosyasini bir nevi ekrana yerlesitir */
        setContentView(R.layout.activity_main);

        tikla1Button = (Button) findViewById(R.id.tikla1Button);
        tikla2Button = (Button) findViewById(R.id.tikla2Button);
        mesajTextView=(TextView) findViewById(R.id.mesajTextView);

        tikla1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Tıkla 1 tıklandı", Toast.LENGTH_LONG);
                toast.show();

                mesajTextView.setText("Tıkla 1");
            }
        });

        View.OnClickListener tikla2Click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tıkla 2 tıklandı!", Toast.LENGTH_SHORT).show();

                mesajTextView.setText("Tıkla 2");
            }
        };
        tikla2Button.setOnClickListener(tikla2Click);


    }


}
