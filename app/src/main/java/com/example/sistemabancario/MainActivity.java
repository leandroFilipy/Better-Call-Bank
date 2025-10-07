package com.example.sistemabancario;
import com.google.android.material.button.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.activity.EdgeToEdge;

import com.example.sistemabancario.repository.Banco;

public class MainActivity extends AppCompatActivity {

    private Banco banco;

    // --- Variáveis dos campos ---
    private EditText editarNome;
    private EditText editarCpf;
    private EditText editarNumero;
    private EditText editarSaldo;
    private EditText editarLimite;
    private EditText editarRendimento;
    private EditText editarValor;

    private EditText editarContaOrigem;
    private EditText editarContaDestino;

    // --- Botões ---
    private Button cadastrarContaCorrente;
    private Button cadastrarContaPoupanca;
    private Button depositar;
    private Button sacar;
    private Button transferir;
    private Button listarContas;
    private Button botaoSegundaTela; // Botão que vai para SegundaTelaActivity2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // EdgeToEdge
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });

        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                 //abre a SegundaTelaActivity2
                Intent intent = new Intent(MainActivity.this, SegundaTelaActivity2.class);
                startActivity(intent);
            }
        });




    }
}
