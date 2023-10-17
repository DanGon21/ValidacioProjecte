package com.example.validacioprojecte;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup grupo = findViewById(R.id.grupCiutats);
        Button boton = findViewById(R.id.buttonResposta);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idresposta = grupo.getCheckedRadioButtonId();
                RadioButton button = findViewById(idresposta);

                Toast toast = Toast.makeText(getApplicationContext(),button.getText(),Toast.LENGTH_LONG);

                toast.show();
            }
        });
    }
}