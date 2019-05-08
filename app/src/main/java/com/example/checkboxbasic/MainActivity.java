package com.example.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView textView;
CheckBox a,j,ph,p,u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        a=findViewById(R.id.checkBox1);
        a.setOnClickListener(this);
        j=findViewById(R.id.checkBox2);
        j.setOnClickListener(this);
        ph=findViewById(R.id.checkBox3);
        ph.setOnClickListener(this);
        p=findViewById(R.id.checkBox4);
        p.setOnClickListener(this);
        u=findViewById(R.id.checkBox5);
        u.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (textView.getId()) {
            case R.id.checkBox1:
                if(a.isChecked())
                    Toast.makeText(getApplicationContext(), "Android",Toast.LENGTH_SHORT);
                break;
            case R.id.checkBox2:
                if(j.isChecked())
                    Toast.makeText(getApplicationContext(), "Java",Toast.LENGTH_SHORT);
                break;
            case R.id.checkBox3:
                if(ph.isChecked())
                    Toast.makeText(getApplicationContext(), "Python",Toast.LENGTH_SHORT);
                break;
            case R.id.checkBox4:
                if(p.isChecked())

                    Toast.makeText(getApplicationContext(), "Php",Toast.LENGTH_SHORT);
                break;
            case R.id.checkBox5:
                if(u.isChecked())
                    Toast.makeText(getApplicationContext(), "Unity3d",Toast.LENGTH_SHORT);
                break;
        }
    }
}
