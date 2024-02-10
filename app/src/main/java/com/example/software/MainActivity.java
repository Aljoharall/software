package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button send_button;
        EditText send_text;
        TextView receiver_msg;

        send_button= findViewById(R.id.send_button_id);
        send_text = findViewById(R.id.send_text_id);
        receiver_msg = (TextView) findViewById(R.id.received_value_id);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// do something

                receiver_msg.setText(send_text.getText().toString());

            }
        });
    }
}