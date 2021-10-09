package com.example.helloandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private Button buttName;
    private TextView tName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName=(EditText)findViewById(R.id.eName);
        buttName=(Button)findViewById(R.id.buttName);
        tName=(TextView)findViewById(R.id.tName);
        buttName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tName.setText("Hello, "+eName.getText());
            }
        });
    }
    public void clicked(View view)
    {
        switch(view.getId())
        {
            case R.id.buttName:
                tName.setText("Hello, "+eName.getText());
                break;
        }
    }
}