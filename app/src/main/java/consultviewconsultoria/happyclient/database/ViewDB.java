package consultviewconsultoria.happyclient.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import consultviewconsultoria.happyclient.R;
import consultviewconsultoria.happyclient.adapter.VotoArrayAdapter;
import consultviewconsultoria.happyclient.object.Voto;

/**
 * Created by janiel on 10/12/2018.
 */

public class ViewDB {
    private SQLiteDatabase con;

        //constructor
        public ViewDB(SQLiteDatabase con) {
            this.con = con;
        }

        //method in class
        public VotoArrayAdapter buscaVoto(Context context) {
            VotoArrayAdapter adVoto = new VotoArrayAdapter( context, R.layout.activity_main_item_voto);
            Cursor c = con.query( "TABELA_VOTO", null, null, null, null, null, null );
            if (c.getCount() > 0) {
                c.moveToFirst();
                do {
                    Voto v = new Voto();
                    v.set_idVoto( c.getLong( 0 ) );
                    v.setExelente( c.getInt( 1 ) );
                    v.setBom( c.getInt( 2 ) );
                    v.setRegular(c.getInt( 4 ) );
                    v.setRuim( c.getInt( 5 ) );
                    v.setPessimo( c.getInt( 6 ) );
                    adVoto.add(v);

                } while (c.moveToNext());
            }
            return adVoto;
            //exit conection listDB
        }

    }

