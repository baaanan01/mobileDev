package com.example.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClickButtons extends AppCompatActivity
{
    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOk = findViewById(R.id.btnOk);
        Button buttonCancel = findViewById(R.id.btnCancel);
        TextView tvOut = (TextView) findViewById(R.id.tvOut);

        View.OnClickListener oclBtnOk = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvOut.setText("Нажата кнопка ОК!");
            }
        };
        buttonOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel!");
            }
        };
        buttonCancel.setOnClickListener(oclBtnCancel);
    }

    public void onMyButtonClick(View view) {
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}