package com.example.tablerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tablerpg.util.Dice;

public class MainActivity extends AppCompatActivity {

    private Button btnD6;
    private Button btnD8;
    private Button btnD20;
    private TextView txvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnD6 = findViewById(R.id.btnD6);
        btnD8 = findViewById(R.id.btnD8);
        btnD20 = findViewById(R.id.btnD20);
        txvResult = findViewById(R.id.resultadoDado);

        btnD6.setOnClickListener(sortDice(1));
        btnD8.setOnClickListener(sortDice(2));
        btnD20.setOnClickListener(sortDice(3));
    }

    private View.OnClickListener sortDice(final int op) {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = 0;
                switch (op) {
                    case 1:
                        result = Dice.d6();
                        txvResult.setText("Resultado D6: " + result);
                        break;

                    case 2:
                        result = Dice.d8();
                        txvResult.setText("Resultado D8: " + result);
                        break;

                    case 3:
                        result = Dice.d20();
                        txvResult.setText("Resultado D20: " + result);
                        break;
                }
            }
        };
    }
}
