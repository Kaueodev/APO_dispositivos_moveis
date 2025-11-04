package com.example.apo_dispositivos_moveis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class SearchActivity extends AppCompatActivity {

    // Declara os componentes da UI para serem acessados no método onCreate
    private TextInputEditText editTextCity;
    private MaterialButton buttonSearch;
    private TextView buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout da activity a partir do XML
        setContentView(R.layout.activity_search);

        // Inicializa os componentes da UI usando findViewById
        editTextCity = findViewById(R.id.editTextCity);
        buttonSearch = findViewById(R.id.buttonSearch);
        buttonAbout = findViewById(R.id.buttonAbout);

        // Configura o listener do botão "Buscar", se ele existir
        if (buttonSearch != null && editTextCity != null) {
            buttonSearch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Pega o nome da cidade digitado pelo usuário e remove espaços extras
                    String city = editTextCity.getText().toString().trim();

                    // Valida se o campo não está vazio
                    if (!city.isEmpty()) {
                        // Prepara a Intent para a tela de resultado (ResultActivity)
                        Intent intent = new Intent(SearchActivity.this, ResultActivity.class);
                        // Adiciona o nome da cidade como um "extra" para ser usado na próxima tela
                        intent.putExtra("CITY_NAME", city);
                        startActivity(intent);
                    } else {
                        // Mostra uma mensagem de erro se o campo da cidade estiver vazio
                        Toast.makeText(SearchActivity.this, "Por favor, digite o nome da cidade", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        // Configura o listener do botão "Sobre", se ele existir
        if (buttonAbout != null) {
            buttonAbout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Cria uma Intent para navegar para a tela de informações (AboutActivity)
                    Intent intent = new Intent(SearchActivity.this, AboutActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
