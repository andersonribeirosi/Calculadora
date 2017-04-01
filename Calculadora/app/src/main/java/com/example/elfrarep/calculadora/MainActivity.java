package com.example.elfrarep.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnZero, btnUm, btnDois, btnTres, btnQuatro, btnCinco, btnSeis,
    btnSete, btnOito, btnNove, btnSoma, btnMulti, btnDiv,
    btnSub, btnIgual, btnLimpar;

    double numero1, numero2, resultado;
    String operador;

    EditText processo, concatenar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnZero = (Button) findViewById(R.id.btnZero);
        Button btnUm = (Button) findViewById(R.id.btnUm);
        Button btnDois = (Button) findViewById(R.id.btnDois);
        Button btnTres = (Button) findViewById(R.id.btnTres);
        Button btnQuatro = (Button) findViewById(R.id.btnQuatro);
        Button btnCinco = (Button) findViewById(R.id.btnCinco);
        Button btnSeis = (Button) findViewById(R.id.btnSeis);
        Button btnSete = (Button) findViewById(R.id.btnSete);
        Button btnOito = (Button) findViewById(R.id.btnOito);
        Button btnNove = (Button) findViewById(R.id.btnNove);
        Button btnSoma = (Button) findViewById(R.id.btnSoma);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnMulti = (Button) findViewById(R.id.btnMulti);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        Button btnIgual = (Button) findViewById(R.id.btnIgual);
        Button btnLimpar = (Button) findViewById(R.id.btnLimpar);

        final EditText processo = (EditText) findViewById(R.id.processo);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "0");
            }
        });

        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "1");
            }
        });

        btnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "2");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "3");
            }
        });

        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "4");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "5");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "6");
            }
        });

        btnSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "7");
            }
        });

        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "8");
            }
        });

        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.processo);
                processo.setText(concatenar.getText().toString() + "9");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText)findViewById(R.id.processo);
                numero2 = Double.parseDouble(concatenar.getText().toString());
                if(operador.equals("+")){
                    processo.setText("");
                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    processo.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")){
                    processo.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    processo.setText("");
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        processo.setText("Infinito");
                    }
                }
                processo.setText(String.valueOf(resultado));
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                concatenar = (EditText)findViewById(R.id.processo);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                processo.setText("");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                concatenar = (EditText)findViewById(R.id.processo);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                processo.setText("");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                concatenar = (EditText)findViewById(R.id.processo);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                processo.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                concatenar = (EditText)findViewById(R.id.processo);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                processo.setText("");
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                processo.setText("");
            }
        });
    }
}
