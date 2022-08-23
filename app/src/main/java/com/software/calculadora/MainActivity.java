package com.software.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer operador = 0;

    String strValores = "";
    Double numero1 = 0.0;
    Double numero2 = 0.0;
    Double resultado = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao0 = findViewById(R.id.botao0);
        Button botao1 = findViewById(R.id.botao1);
        Button botao2 = findViewById(R.id.botao2);
        Button botao3 = findViewById(R.id.botao3);
        Button botao4 = findViewById(R.id.botao4);
        Button botao5 = findViewById(R.id.botao5);
        Button botao6 = findViewById(R.id.botao6);
        Button botao7 = findViewById(R.id.botao7);
        Button botao8 = findViewById(R.id.botao8);
        Button botao9 = findViewById(R.id.botao9);

        Button botaoDivisao = findViewById(R.id.botaoDividir);
        Button botaoMultiplicacao = findViewById(R.id.botaoMultiplicar);
        Button botaoSubtrair = findViewById(R.id.botaoSubtrair);
        Button botaoAdicao = findViewById(R.id.botaoAdicao);
        Button botaoPonto = findViewById(R.id.botaoPonto);
        Button botaoResultado = findViewById(R.id.botaoResultado);
        Button botaoApagar = findViewById(R.id.botaoApagar);

        TextView campoTexto = findViewById(R.id.campoTexto);

        botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("0");

                campoTexto.setText(strValores);
            }
        });

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("1");

                campoTexto.setText(strValores);

            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("2");

                campoTexto.setText(strValores);
            }
        });

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("3");

                campoTexto.setText(strValores);
            }
        });

        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("4");

                campoTexto.setText(strValores);
            }
        });

        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("5");

                campoTexto.setText(strValores);
            }
        });

        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("6");

                campoTexto.setText(strValores);
            }
        });

        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("7");

                campoTexto.setText(strValores);
            }
        });

        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("8");

                campoTexto.setText(strValores);
            }
        });

        botao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strValores = strValores.concat("9");

                campoTexto.setText(strValores);
            }
        });

        botaoPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer aux = strValores.indexOf(".");

                if (aux == -1) {
                    strValores = strValores.concat(".");

                    campoTexto.setText(strValores);
                }
            }
        });

        botaoApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (strValores.length() != 0) {
                    StringBuilder str = new StringBuilder(strValores);
                    str.deleteCharAt(strValores.length() - 1);

                    strValores = str.toString();

                    campoTexto.setText(strValores);
                }
            }
        });

        botaoDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 1;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                campoTexto.setText(strValores);

            }
        });

        botaoMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 2;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                campoTexto.setText(strValores);

            }
        });

        botaoSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 3;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                campoTexto.setText(strValores);

            }
        });

        botaoAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = 4;

                numero1 = Double.parseDouble(strValores);

                strValores = "";
                campoTexto.setText(strValores);
            }
        });

        botaoResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2 = Double.parseDouble(strValores);

                if (operador == 1 && numero2 == 0) {
                    campoTexto.setText("Divisão por 0");
                } else {
                    switch (operador) {
                        case 1: {
                            resultado = numero1 / numero2;

                            break;
                        }
                        case 2: {
                            resultado = numero1 * numero2;

                            break;
                        }
                        case 3: {
                            resultado = numero1 - numero2;

                            break;
                        }
                        case 4: {
                            resultado = numero1 + numero2;

                            break;
                        }
                    }

                    if (((resultado * 10) % 10) == 0) {
                        Integer aux = resultado.intValue();

                        campoTexto.setText(aux.toString());
                    } else {
                        campoTexto.setText(String.format("%.2f", resultado));
                    }
                }
            }
        });
    }

}