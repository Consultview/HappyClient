package consultviewconsultoria.happyclient.tela;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import consultviewconsultoria.happyclient.R;
import consultviewconsultoria.happyclient.database.Conection;
import consultviewconsultoria.happyclient.object.Voto;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivityVoto extends AppCompatActivity {

    ImageView imgExcelente;
    ImageView imgBom;
    ImageView imgRegular;
    ImageView imgRuim;
    ImageView imgPessimo;

    SQLiteDatabase db;
    Conection con;
    Voto v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_voto);

        v = new Voto();
        castById();

    }

    @Override//selection item
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.imageViewExecelente:
                v.setExelente(+1);
                Toast.makeText(this, "Inserido com sucesso"+v.getExelente(), LENGTH_LONG).show();
                break;

            case R.id.imageViewBom:
                v.setBom(+1);
                Conection con = new Conection(getApplicationContext());
                if (v.get_idVoto() == 0) {
                    con.insertVoto(v);
                    Toast.makeText(this, "Inserido com sucesso", LENGTH_LONG).show();
                    con.close();
                    break;

                } else {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                    dlg.setTitle("Aviso !");
                    dlg.setMessage("Esta sendo testado nao inserido !");
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                    con.close();
                    break;
                }

            case R.id.imageViewRegular:
                v.setRegular(+1);
                Toast.makeText(this, "Inserido com sucesso"+v.getRegular(), LENGTH_LONG).show();
                break;

            case R.id.imageViewRuim:
                v.setRuim(+1);
                Toast.makeText(this, "Inserido com sucesso"+v.getRuim(), LENGTH_LONG).show();
                break;

            case R.id.imageViewPessimo:
                v.setPessimo(+1);
                Toast.makeText(this, "Inserido com sucesso"+v.getPessimo(), LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected( item );
    }


    public void castById() {

        imgExcelente = findViewById( R.id.imageViewExecelente );
        imgBom = findViewById( R.id.imageViewBom );
        imgRegular = findViewById( R.id.imageViewRegular );
        imgRuim = findViewById( R.id.imageViewRuim );
        imgPessimo = findViewById( R.id.imageViewPessimo );

    }


}
