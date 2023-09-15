package Evaluacion.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TerceraPantalla extends AppCompatActivity {
    /**R = Resultado **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pantalla);
        double r = getIntent().getDoubleExtra("Resultado", 0.0);

        TextView Txt_Resultado = findViewById(R.id.Txt_Resultado);
        Txt_Resultado.setText(String.valueOf(r));

        Button Bttn_Volver = findViewById(R.id.Btto_Volver);
        Bttn_Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TerceraPantalla.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}