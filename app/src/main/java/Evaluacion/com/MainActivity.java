package Evaluacion.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     private EditText TxtCamp1;
     private  EditText TxtCamp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TxtCamp1 = findViewById(R.id.Txt_CostoVerdura);
        TxtCamp2 = findViewById(R.id.Txt_Total);
        Button Bttn_Calcular = findViewById(R.id.Btto_Calcular);
        Bttn_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcu();
            }
        });
        Button Bttn_Limpiar = findViewById(R.id.Btto_Limpiar);
        Bttn_Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TxtCamp1.setText("");
                TxtCamp2.setText("");
            }
        });

    }
    private void Calcu(){
        /**R = Resultado
         Camp1 y Camp2 Se refiere A los campos de Txt_CostoVerdura y Txt_Total
          **/
        String Camp1 = TxtCamp1.getText().toString();
        String Camp2 = TxtCamp2.getText().toString();
        double n1 = Double.parseDouble(Camp1);
        double n2 = Double.parseDouble(Camp2);
        double r = n1 * n2;
        Intent intent = new Intent(this,TerceraPantalla.class);
        intent.putExtra("Resultado",r);
        startActivity(intent);
    }

}