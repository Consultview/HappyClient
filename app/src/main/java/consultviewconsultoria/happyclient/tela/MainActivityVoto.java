package consultviewconsultoria.happyclient.tela;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
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

    public void castById() {
        imgExcelente = findViewById( R.id.imageViewExecelente );
        imgBom = findViewById( R.id.imageViewBom );
        imgRegular = findViewById( R.id.imageViewRegular );
        imgRuim = findViewById( R.id.imageViewRuim );
        imgPessimo = findViewById( R.id.imageViewPessimo );

    }

    public void clickExcelente(View view) {
		//if(v.getExelente => 1 ){
		
        v.setExelente(1);
        Toast.makeText( this, "EXCELENTE! \n obrigado! volte sempre!"+v.getExelente(), Toast.LENGTH_SHORT ).show();

    }
    public void clickBom(View view) {

        v.setBom(1);
        Toast.makeText( this, "BOM! \n Obrigado"+v.getBom(), Toast.LENGTH_SHORT ).show();

    }

    public void clickRegular(View view) {

        v.setRegular(+1);
        Toast.makeText( this, "REGULAR! \n "+v.getRegular(), Toast.LENGTH_SHORT ).show();
    }

    public void clickRuim(View view) {
        v.setRuim(+1);
        Toast.makeText( this, "RUIM! \n vamos melhorar"+v.getRuim(), Toast.LENGTH_SHORT ).show();
    }

    public void clickPessimo(View view) {
        v.setPessimo(+1);
        Toast.makeText( this, "PESSIMO! \n obrigado, ainda temos muito que melhorar"+v.getPessimo(), Toast.LENGTH_SHORT ).show();

    }
}

















