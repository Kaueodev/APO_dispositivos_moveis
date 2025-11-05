package com.example.apo_dispositivos_moveis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout para esta Activity, associando-a ao seu arquivo XML.
        setContentView(R.layout.activity_about);

        // Localiza o botão "Voltar" (que é um TextView estilizado) pelo seu ID.
        TextView buttonBack = findViewById(R.id.buttonBack);

        // Garante que o aplicativo não falhe se o botão não for encontrado.
        if (buttonBack != null) {
            // Configura um listener de clique para o botão "Voltar".
            buttonBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // O método finish() encerra a Activity atual (AboutActivity)
                    // e remove-a da pilha de atividades, retornando o usuário
                    // à tela anterior (SearchActivity) sem recriá-la.
                    finish();
                }
            });
        }
    }
}