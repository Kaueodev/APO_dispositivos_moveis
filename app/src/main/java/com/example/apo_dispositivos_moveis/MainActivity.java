package com.example.apo_dispositivos_moveis;

import androidx.appcompat.app.AppCompatActivity;import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout da activity a partir do XML
        setContentView(R.layout.activity_main);

        // Encontra o botão "Entrar" pelo ID 'buttonEnter' definido no XML
        MaterialButton buttonEnter = findViewById(R.id.buttonEnter);

        // Garante que o app não feche se o botão não for encontrado no layout
        if (buttonEnter != null) {
            // Configura o listener de clique para o botão "Entrar"
            buttonEnter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Cria uma Intent para navegar da MainActivity para a SearchActivity
                    Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}