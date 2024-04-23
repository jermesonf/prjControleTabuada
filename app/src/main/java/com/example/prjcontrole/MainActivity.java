package com.example.prjcontrole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtSaida;
    SeekBar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSaida = findViewById(R.id.txtSaida); //instanciando elemento
        sb = findViewById(R.id.sb);


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {//tudo isso é parametro
            @Override //reescrito (opcional) serve mais como aviso
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean bn)//definido as variaveis
            {
                //programe aqui

                String resultado = "";
                int num = posicao;

                for(int i = 1 ; i <= 10 ; i++)
                {
                    resultado += num + " x " + i + " = " + (num*i) + "\n";
                }

                //txtSaida.setText(posicao + ""); //permite que a SeekBar deslize e mostre os numeros
                txtSaida.setText((resultado));
            }

            @Override//não pode apagar pois faz parte do parametro
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não pode apagar pois faz parte do parametro
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

    }


}