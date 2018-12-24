package consultviewconsultoria.happyclient.tela;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import consultviewconsultoria.happyclient.R;

public class MainActivityInicial extends AppCompatActivity {

    ImageView excelente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicial);

        excelente = findViewById(R.id.imageViewExecelente);
        excelente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityInicial.this, MainActivityVoto.class);
                startActivity(intent);
                Toast.makeText(MainActivityInicial.this, "Bem Vindo !", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
