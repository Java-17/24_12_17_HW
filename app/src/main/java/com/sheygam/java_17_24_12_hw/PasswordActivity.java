package com.sheygam.java_17_24_12_hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private Button backBtn, okBtn;
    private String email;
    private EditText inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        email = getIntent().getStringExtra("EMAIL");
        inputPassword = findViewById(R.id.input_password);
        backBtn = findViewById(R.id.back_btn);
        okBtn = findViewById(R.id.ok_btn);
        backBtn.setOnClickListener(this);
        okBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_btn:
                finish();
                break;
            case R.id.ok_btn:
                Intent intent = new Intent();
                intent.putExtra("EMAIL",email);
                intent.putExtra("PASSWORD",inputPassword.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
                break;
        }
    }
}
