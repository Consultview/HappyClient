package consultviewconsultoria.happyclient.tela;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import consultviewconsultoria.happyclient.R;

public class MainActivityInicial extends AppCompatActivity {

    Button entra;
    EditText email;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicial);

        entra = findViewById(R.id.entra);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);

        entra.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                try {
                    if (senha.getText().toString().trim().equals("") || email.getText().toString().equals("")) {
                        Toast.makeText(MainActivityInicial.this, "Não deixe campo vazio !", Toast.LENGTH_SHORT).show();

                    } else {
                        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivityInicial.this);
                        dlg.setTitle("Aviso !");
                        dlg.setMessage("Bem vindo !");
                        dlg.setNeutralButton("ok", null);
                        dlg.show();
                        Intent intent = new Intent(MainActivityInicial.this, MainActivityVoto.class);
                        startActivity(intent);
                    }
                } catch (android.database.SQLException e) {
                    e.printStackTrace();
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivityInicial.this);
                    dlg.setTitle("Aviso !");
                    dlg.setMessage("houve um erro \n" + e);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                }
            }
        });


    }
}