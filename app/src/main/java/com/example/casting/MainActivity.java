package com.example.casting;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText Numero1;
    public EditText Numero2;
    public Button btnSumar;
    public Button btnRestar;
    public Button btnMultiplicar;
    public Button btnDividir;
    public TextView ResultadoTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.restar);
        btnMultiplicar = (Button) findViewById(R.id.multiplicar);
        btnDividir = (Button) findViewById(R.id.dividir);
        Numero1 = (EditText) findViewById(R.id.Numero1);
        Numero2 = (EditText) findViewById(R.id.Numero2);
        ResultadoTotal = (TextView) findViewById(R.id.Resultado);
        // agrego los listeners
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        {
            //Casting de las variables
            int num1 = Integer.parseInt(Numero1.getText().toString());
            int num2 = Integer.parseInt(Numero2.getText().toString());
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1*num2;
            int division = num1/num2;
            switch (v.getId()) {
                case R.id.btnSumar:
                    ResultadoTotal.setText("El Resultado es :"+suma);
                    break;
                case R.id.restar:
                    ResultadoTotal.setText("El Resultado es :"+resta);
                    break;
                case R.id.multiplicar:
                    ResultadoTotal.setText("El Resultado es:"+multiplicacion);
                    break;
                case R.id.dividir:
                    ResultadoTotal.setText("El resultado es"+division);
                    break;
                    default:

                        ResultadoTotal.setText("Ingrese un Numero Correcto");

            }
        }
    }
}






        //int valor1  =Integer.parseInt(Numero1.getText().toString());
           // int valor2  =Integer.parseInt(Numero1.getText().toString());
            //int x = valor1 + valor2;
           // ResultadoTotal.setText("El resultado es ")

  //  }
//}