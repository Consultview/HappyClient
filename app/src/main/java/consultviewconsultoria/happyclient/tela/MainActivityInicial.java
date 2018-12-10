package consultviewconsultoria.happyclient.tela;


import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.ImageView;


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
                Intent intent = new Intent(MainActivityInicial.this,MainActivityVoto.class);
                startActivity(intent);
                //Toast.makeText(MainActivityInicial.this, "objeto clicado",Toast.LENGTH_SHORT).show();



            }
        });

    }





    /**
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_inicial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
