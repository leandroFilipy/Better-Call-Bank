package com.example.sistemabancario;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
public class SegundaTelaActivity2 extends AppCompatActivity {

    private EditText digit1, digit2, digit3, digit4, digit5, digit6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela2);

        digit1 = findViewById(R.id.digit1);
        digit2 = findViewById(R.id.digit2);
        digit3 = findViewById(R.id.digit3);
        digit4 = findViewById(R.id.digit4);
        digit5 = findViewById(R.id.digit5);
        digit6 = findViewById(R.id.digit6);

        addAutoMove(digit1, digit2);
        addAutoMove(digit2, digit3);
        addAutoMove(digit3, digit4);
        addAutoMove(digit4, digit5);
        addAutoMove(digit5, digit6);

        setupBackspace(digit6, digit5);
        setupBackspace(digit5, digit4);
        setupBackspace(digit4, digit3);
        setupBackspace(digit3, digit2);
        setupBackspace(digit2, digit1);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //abre a telaHome
                Intent intent = new Intent(SegundaTelaActivity2.this, TelaHome.class);
                startActivity(intent);
            }
        });

    }

    private void addAutoMove(EditText current, EditText next) {
        current.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    next.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void setupBackspace(EditText current, EditText previous) {
        current.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DEL &&
                        event.getAction() == KeyEvent.ACTION_DOWN &&
                        current.getText().toString().isEmpty()) {
                    previous.requestFocus();
                    return true;
                }
                return false;
            }
        });
    }



}
