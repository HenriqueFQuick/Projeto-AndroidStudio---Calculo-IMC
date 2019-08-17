package com.example.lddm_imc_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcularIMC(View view){
        EditText editText_Peso = findViewById(R.id.editText_DigiteSeuPeso);
        EditText editText_Altura = findViewById(R.id.editText_DigiteSuaAltura);

        TextView textView_IMC = findViewById(R.id.textView_IMC);
        TextView textView_Classificacao = findViewById(R.id.textView_Classificacao);

        double peso = Double.valueOf(editText_Peso.getText().toString());
        double altura = Double.parseDouble(editText_Altura.getText().toString())/100;
        double imc =  Math.round(peso/(altura*altura));

        textView_IMC.setText(String.valueOf(imc));

        if(imc <= 16){
            textView_Classificacao.setText("Magreza extrema");
        }else if(imc > 16 && imc <= 17){
            textView_Classificacao.setText("Magreza Moderada");
        }else if(imc > 17 && imc <= 18.5){
            textView_Classificacao.setText("Magreza leve");
        }else if(imc > 18.5 && imc <= 25){
            textView_Classificacao.setText("Saudavel");
        }else if(imc > 25 && imc <= 30){
            textView_Classificacao.setText("Sobrepeso");
        }else if(imc > 30 && imc <= 35){
            textView_Classificacao.setText("Obesidade Grau 1");
        }else if(imc > 35 && imc <= 40){
            textView_Classificacao.setText("Obesidade Grau 2(severa)");
        }else textView_Classificacao.setText("Pbesidade Grau3 (morbita)");
    }
}
