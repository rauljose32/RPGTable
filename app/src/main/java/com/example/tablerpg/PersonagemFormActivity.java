package com.example.tablerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.tablerpg.model.Classe;
import com.example.tablerpg.model.Sexo;
import com.example.tablerpg.util.UtilPersonagem;

public class PersonagemFormActivity extends AppCompatActivity {

    EditText etNome;
    EditText etIdade;
    CheckBox cbClassGuerreiro;
    CheckBox cbClassMago;
    CheckBox cbClassArqueiro;
    CheckBox cbSexoMasc;
    CheckBox cbSexoFemn;
    Button btnConfirmar;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem_form);

        etNome = findViewById(R.id.etNome);
        etIdade = findViewById(R.id.etIdade);
        cbClassGuerreiro = findViewById(R.id.cbClassGuerreiro);
        cbClassArqueiro = findViewById(R.id.cbClassArqueiro);
        cbClassMago = findViewById(R.id.cbClassMago);
        cbSexoFemn = findViewById(R.id.cbSexoFem);
        cbSexoMasc = findViewById(R.id.cbSexoMasc);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnCancelar = findViewById(R.id.btnCancelar);

        String nome = String.valueOf(etNome);
        int idade = Integer.valueOf(String.valueOf(etIdade));


        if (cbClassGuerreiro.isChecked()) {
            if (cbSexoMasc.isChecked()) {
                btnConfirmar.setOnClickListener(createPersonagem(nome, idade, Classe.CAVALEIRO, Sexo.MASCULINO));
            }
            if (cbSexoFemn.isChecked()) {
                btnConfirmar.setOnClickListener(createPersonagem(nome, idade, Classe.CAVALEIRO, Sexo.FEMININO));
            }
        }

        if (cbClassMago.isChecked()) {
            if (cbSexoMasc.isChecked()) {
                btnConfirmar.setOnClickListener(createPersonagem(nome, idade, Classe.MAGO, Sexo.MASCULINO));
            }
            if (cbSexoFemn.isChecked()) {
                btnConfirmar.setOnClickListener(createPersonagem(nome, idade, Classe.MAGO, Sexo.FEMININO));
            }
        }

        if(cbClassArqueiro.isChecked()){
            if(cbSexoMasc.isChecked()){
                btnConfirmar.setOnClickListener(createPersonagem(nome, idade, Classe.ARQUEIRO, Sexo.MASCULINO));
            }
            if(cbSexoFemn.isChecked()){
                btnConfirmar.setOnClickListener(createPersonagem(nome, idade, Classe.ARQUEIRO, Sexo.FEMININO));
            }
        }
    }

    private View.OnClickListener createPersonagem(final String nome, final int idade, final Classe classe, final Sexo sexo) {
        return new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                UtilPersonagem.createPersonagem(nome, idade, classe, sexo);

            }
        };
    }
}
