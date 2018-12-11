package consultviewconsultoria.happyclient.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import consultviewconsultoria.happyclient.object.Voto;

/**
 * Created by janiel on 08/12/2018.
 */

public class Conection extends SQLiteOpenHelper{

    private static final String DB_VOTO = "DB_VOTO";
    private static final int VERSAO_BANCO = 1;
    public static final String TABELA_USER = "TABELA_USER";
    public static final String TABELA_VOTO = "TABELA_VOTO";


    // review is local storage database
    private static final String Path_db = "/data/user/0/database/database/DB_VOTO";
    private Context context;
    private SQLiteDatabase db;

    //----------constructor class-------
    public Conection(Context context) {
        super( context, DB_VOTO, null, VERSAO_BANCO );
        this.context = context;
        db = getWritableDatabase();
    }

    //----------open database--------------
    private void openDB() {
        if (!db.isOpen()) {
            db = context.openOrCreateDatabase( Path_db, SQLiteDatabase.OPEN_READWRITE, null );
        }
    }


    //--------method create table product database--------
    public boolean createDB() {
        openDB();
        String createTable = "CREATE TABLE IF NOT EXISTS " + TABELA_VOTO + " ("
                + "_ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "VOTO_EXCELENTE INTENGER, "
                + "VOTO_BOM INTENGER, "
                + "VOTO_REGULAR INTENGER, "
                + "VOTO_RUIM INTENGER, "
                + "VOTO_PESSIMO INTENGER) ";

        try {
            db.execSQL( createTable );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            db.close();
        }
    }

    //---------------persistence product-----------------
    //population table product database
    public boolean insertVoto(Voto voto) {
        openDB();
        try {
            ContentValues v = new ContentValues();
            v.put( "VOTO_EXCELENTE", voto.getExelente() );
            v.put( "VOTO_BOM", voto.getBom() );
            v.put( "VOTO_REGULAR", voto.getRegular() );
            v.put( "VOTO_RUIM", voto.getRuim() );
            v.put( "VOTO_PESSIMO", voto.getPessimo() );

            //insert database
            db.insert( "TABELA_VOTO", null, v );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            db.close();
        }
    }

    //----------update product table---------
    public boolean updateDB(Voto voto) {
        openDB();
        try {
            ContentValues v = new ContentValues();
            v.put( "VOTO_EXCELENTE", voto.getExelente() );
            v.put( "VOTO_BOM", voto.getBom() );
            v.put( "VOTO_REGULAR", voto.getRegular() );
            v.put( "VOTO_RUIM", voto.getRuim() );
            v.put( "VOTO_PESSIMO", voto.getPessimo() );

            db.update( "TABELA_VOTO", v, "_id=" + voto.get_idVoto(), null );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            db.close();
        }
    }

/**

    //-----create database table user-----
    public boolean createTableUser() {
        openDB();
        String createTable = "CREATE TABLE IF NOT EXISTS " + TABELA_USER + " ("
                + "_ID_USER INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NOME_USER TEXT, "
                + "EMAIL_USER TEXT, "
                + "SENHA_USER TEXT) ";
        try {
            db.execSQL( createTable );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            db.close();
        }
    }

    /**
    //---------Insert user---------
    public boolean insertUser(usuario u) {
        openDB();
        try {
            ContentValues va = new ContentValues();
            va.put( "ID_USER", u.getIduser() );
            va.put( "NOME_USER", u.getNome() );
            va.put( "EMAIL_USER", u.getSenha() );
            va.put( "SENHA_USER", u.getSenha() );

            //insert database
            db.insert( "TABELA_USER", null, va );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            db.close();
        }
    }

    //----------delete table user------
    public boolean deleteTableUser() {
        openDB();
        String deletTable = "DROP TABLE IF EXISTS " + TABELA_USER;
        try {
            db.execSQL( deletTable );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            db.close();
        }
    }
*/


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
